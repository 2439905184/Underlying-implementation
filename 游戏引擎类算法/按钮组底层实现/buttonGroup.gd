var status = [0,0,0,0]
func change(idx:int):
    status[idx] = 1
    var index = 0
    for item in status:
        if index != idx:
            status[index] = 0
        index += 1
    return status
# 将第三个元素开启，同时其他元素关闭
print(change(3))