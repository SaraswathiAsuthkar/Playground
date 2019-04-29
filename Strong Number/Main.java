import java.util.Scanner;
class Main{
	public static void main (String[] args)
    { 
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int num = n,sum=0;
      int fact=1;
      while(num>0)
      {
        int rem = num%10;
        for(int i=1;i<=rem;i++)
        {
          fact=fact*i;
        }
        num=num/10;
        sum =sum + fact;
        fact=1;
      }
      if(sum==n)
      {
      System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}