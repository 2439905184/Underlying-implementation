var lights = [0,0,0,0];
function change(idx)
{
	lights[idx] = 1;
	for(index=0; index < lights.length; index++)
	{
		if(index != idx)
		{
			lights[index] = 0;
		}
	}
	return lights;
}
console.log(change(3))