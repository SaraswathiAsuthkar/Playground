import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
      for(int i=row;i>=1;i--)
      {
        for(int j=col;j>=1;j--)
        {
          if(j>i)
            System.out.print(j);
          else
            System.out.print(i);
        }
        System.out.println();
          
      } 
    }
}