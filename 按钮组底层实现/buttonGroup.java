import java.util.Arrays;

public class buttonGroup
{
    private static int[] status = {1,1,1,1};
    public static int[] change(int idx)
    {
        status[idx] = 1;
        for(int i = 0; i < status.length; i++)
        {
            if(i != idx)
            {
                status[i] = 0;
            }
        }
        return status;
    }
    public static void main(String args[])
    {
        System.out.println(Arrays.toString(change(3)));
    }
}