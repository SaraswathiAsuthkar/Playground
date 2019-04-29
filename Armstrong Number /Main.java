import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
	   Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int num = n;
      int dig_count=0;
      while(num>0)
      {
        dig_count++;
        num=num/10;
      }
      num=n;
      int pow=1 , sum = 0;
      while(num>0)
      {
        int rem = num%10;
      for(int i=1;i<=dig_count;i++)
      {
        pow = pow * rem;
      }
        sum=sum+pow;
        pow=1;
        num=num/10;
      }
      if(sum==n)
      {
      System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
        
	}
}