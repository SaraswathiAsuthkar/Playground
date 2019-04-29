import java.util.Scanner;
public class Main      {
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int great=greatest(n1,n2,n3);
      System.out.println(great);
	}
	// Function to find the gcd of 2 numbers
	public static int greatest(int num1, int num2 , int num3)
	{
	   int max;
	    if((num1>num2)&&(num3>num1))
	    {
	        if (num1>num3)
            {
             max=num1;
            }
            else
            {
            max=num3;
            }
        }
      else
      {
        if(num2>num1)
        {
          max=num2;
        }
          else
         {
            max=num1;
          }
      }      
  return max;
    }
}