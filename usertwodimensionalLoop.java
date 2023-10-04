import java .util.Scanner;
public class TwodimensionalLoop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][]a=new int[4][3];
        for(int i=0;i<4;i++)
        for(int j=0; j<3;j++)
        {
            a[i][j]= sc.nextInt();
        }
    }
        System.out.println("two dimension array is :");
        for(int i=0; i<3;i++)
        {
            for(int j=0; j<2;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
