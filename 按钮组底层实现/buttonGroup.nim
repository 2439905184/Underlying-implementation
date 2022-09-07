var status = [0,0,0,0]
proc change(idx:int):array[0..3,int] = 
    status[idx] = 1
    for index, item in status:
        if index != idx:
            status[index] = 0
    return status
# 将第三个元素开启，同时其他元素关闭
echo(change(3))