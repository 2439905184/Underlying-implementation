package 体素游戏方块层级填充算法;

import java.util.ArrayList;

//以opengl坐标系，向上为y轴为例子
public class Main
{
    private ArrayList<Vector3> blocks = new ArrayList<Vector3>();
    //一个区块
    // 基于3D打印机扫描原理
    public void gen_blocks()
    {
        for(int y=0; y<16; y++)
        {
            for(int x=0; x<16; x++) 
            {
                // z轴
                for(int z=0; z < 16; z++)
                {
                    blocks.add(new Vector3(x,y,z));
                }
            }
        }
    }
    // 获得方块位置信息
    public void get_blocks()
    {
        for(int i=0; i < blocks.size(); i++)
        {
            System.out.println("x: " + blocks.get(i).x + " y: "+blocks.get(i).y + " z: "+blocks.get(i).z);
        }
    }
    public static void main(String[] args)
    {
        Main a = new Main();
        a.gen_blocks();
        a.get_blocks();
    }
    class Vector3
    {
        private int x;
        private int y;
        private int z;
        public Vector3(int x, int y, int z)
        {
            this.x=x;
            this.y=y;
            this.z=z;
        }
    }
}
