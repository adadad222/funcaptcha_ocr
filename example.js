const fs = require('fs');
const axios = require('axios');

async function ocr() {
    try {
        // 读取图片并转换为base64
        const imageBuffer = fs.readFileSync('xxxxx.jpg');
        const imageBase64 = imageBuffer.toString('base64');
        
        const headers = {
            'Content-Type': 'application/json',
            'Authorization': 'Bearer youtoken_key'
        };
        
        const data = {
            'captchaType': 'fun11',
            'image': imageBase64
        };
        
        const response = await axios.post(
            'http://xxxx.com/api/v1/tasks',
            data,
            { headers }
        );
        
        console.log(response.data);
    } catch (error) {
        console.error('Error:', error.response?.data || error.message);
    }
}

ocr();