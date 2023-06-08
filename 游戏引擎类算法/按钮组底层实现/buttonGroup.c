#include <stdio.h>
int status[] = {0,0,0,0};
int *change(int idx)
{
	status[idx] = 1;
	int length = sizeof(status)/sizeof(int);
	for(int index=0; index < length; index++)
	{
		if(index != idx)
		{
			status[index] = 0;
		}
	}
	return status;
}
int main()
{
	int *p_result = change(3);
	for(int i=0; i< sizeof(status)/sizeof(int); i++)
	{
		printf("%d",p_result[i]);
	}
	return 0;
}