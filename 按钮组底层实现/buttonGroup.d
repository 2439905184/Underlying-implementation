import std.stdio;

int[] a = [1,1,1,1];

int[] change(int idx)
{
	a[idx] = 1;
	for(int i=0; i< a.length; i++)
	{
		if(i != idx)
		{
			a[i] = 0;
		}
	}
	return a;
}

void main()
{
	int[] result = change(3);
	writeln(result);
}