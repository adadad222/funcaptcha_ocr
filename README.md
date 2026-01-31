# funcaptcha_ocr
Countering Arkose CAPTCHA technology funcaptcha arkoselabs ocr Verification code identification fun arkose验证码识别 ocr Arkose验证码识别 Arkose FunCaptcha识别工具 Labs 验证码解决方案 对抗Arkose验证码技术 自动通过Arkose验证码 FunCaptcha答题自动化 FunCaptcha audio challenge solver Arkose captcha solver for ticketing bots



## 免费测试请联系： [https://t.me/constantsas](https://t.me/constantsas)

## For free testing please contact: [https://t.me/constantsas](https://t.me/constantsas)


Arkose验证码识别

Arkose验证码生成

Arkose验证码破解

Arkose Labs 验证码解决方案

FunCaptcha识别工具

对抗Arkose验证码技术

自动识别Arkose验证码API

Arkose验证码机器学习识别

绕过FunCaptcha验证方法

Arkose验证码批量识别服务

后续不断更新。。。。。
To be continuously updated...


example.py
```
import requests
import base64

# 读取图片并转换为base64
with open("xxxxx.jpg", "rb") as image_file:
    image_base64 = base64.b64encode(image_file.read()).decode('utf-8')

#例 
# headers = {
#     'Content-Type': 'application/json',
#     'Authorization': 'Bearer scveghGKo4ZWSAjlUvOLZO43k888E_WTmuadgfkGgFA',
# }

headers = {
    'Content-Type': 'application/json',
    'Authorization': 'Bearer youtoken_key',
}

# captchaType:图片的类别
json_data = {
    'captchaType': 'fun11',
    'image': image_base64
}

def ocr():
    response = requests.post(
        'http://xxxx.com/api/v1/tasks',
        headers=headers,
        json=json_data
    )

    print(response.json())

ocr()

# 反回
# 成功
# {'token_key': 'you token_key', 'result': '3', 'msg': '成功'}

# 失败
# {'token_key': 'you token_key', 'result': None, 'msg': '识别失败'}

```



captchaType类型就是图片相对的名字
支持以下图片
![alt text](image.png)
![alt text](1000_bany_ico.jpg) ![alt text](1000_jiazi_ico.jpg) ![alt text](1000_Shouzhi_ico.jpg) ![alt text](1000_shubei_ico.jpg) ![alt text](1000_shuipao_ico.jpg) ![alt text](1200_car_distance.jpg) ![alt text](1200_icon_line.jpg) ![alt text](1200_shaizi.jpg) ![alt text](1200_Shouzhi_fangxiang.jpg) ![alt text](1200_Stack_stones.jpg) ![alt text](1200_Stone_number.jpg) ![alt text](1200_zuowei_ico.jpg) ![alt text](1600_ShouZhi_and_ico.jpg) ![alt text](1600_Vegetable.jpg)