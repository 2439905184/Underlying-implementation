status = [0,0,0,0]
def change(idx):
    status[idx] = 1
    for index, item in enumerate(status):
        if index != idx:
            status[index] = 0
    return status
# 将第三个元素开启，同时其他元素关闭
print(change(3))