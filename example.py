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