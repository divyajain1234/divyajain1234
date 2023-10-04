mport java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       int[][] board = new int[3][3];
       for (int i=0;i< board.length;i++){
           for(int j=0;j<board[i].length;j++)
           board[i][j] = i+j;
       }
       System.out.println("another way to print array=\n");
       System.out.println(Arrays.deepToString(board));
    }
}
