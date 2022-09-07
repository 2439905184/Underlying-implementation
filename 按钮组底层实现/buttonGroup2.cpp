// 由fawdlstty提供的版本 c++中实现可以返回数组的函数
#include <stdio.h>
#include <stdlib.h>
typedef struct {
	int len;
	int data[0];
} MyArray, *PMyArray;
PMyArray func(int len)
{
	PMyArray _arr = (PMyArray) malloc (sizeof (MyArray) + sizeof (int) * len);
	_arr->len = len;
	for (int i = 0; i < len; ++i)
		_arr->data[i] = i;
	return _arr;
}
int main()
{
	PMyArray _arr = func (10);
	for(int i=0; i< _arr->len; i++)
	{
		printf("%d", _arr->data[i]);
	}
	return 0;
}
