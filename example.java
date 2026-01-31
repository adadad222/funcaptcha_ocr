import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class CaptchaOCR {
    
    public static void main(String[] args) {
        try {
            // 读取图片并转换为base64
            File imageFile = new File("xxxxx.jpg");
            FileInputStream imageInputStream = new FileInputStream(imageFile);
            byte[] imageData = new byte[(int) imageFile.length()];
            imageInputStream.read(imageData);
            imageInputStream.close();
            
            String imageBase64 = Base64.getEncoder().encodeToString(imageData);
            
            // 创建HTTP客户端
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("http://xxxx.com/api/v1/tasks");
            
            // 设置请求头
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("Authorization", "Bearer youtoken_key");
            
            // 构建JSON请求体
            JSONObject jsonData = new JSONObject();
            jsonData.put("captchaType", "fun11");
            jsonData.put("image", imageBase64);
            
            StringEntity requestEntity = new StringEntity(
                jsonData.toString(),
                "UTF-8"
            );
            httpPost.setEntity(requestEntity);
            
            // 发送请求
            CloseableHttpResponse response = httpClient.execute(httpPost);
            
            try {
                HttpEntity entity = response.getEntity();
                String responseString = EntityUtils.toString(entity, "UTF-8");
                System.out.println(responseString);
            } finally {
                response.close();
                httpClient.close();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}