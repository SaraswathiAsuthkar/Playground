import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
    	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int val=1;
      for(int i=1;i<=n;i++)
      {
        for(int sp=1;sp<=n-i;sp++)
       
         System.out.print(" ");
        {
        for(int j=1;j<=i;++j)
        {
          System.out.print(val+" ");
          val++;
        }
        }
      System.out.println();
    }
            
    }    
}