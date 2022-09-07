lights = {0,0,0,0};
function change(idx)
    lights[idx] = 1
	for key,value in pairs(lights) do
	    if(key ~= idx) then
			lights[key] = 0;
        end
	end
	return lights
end
change(3)
for key,value in pairs(lights) do
    print(value)
end