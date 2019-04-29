import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int c = sc.nextInt();
      switch(c)
      {
        case 1:int n3 = sc.nextInt();
        	   System.out.println(n3*n3);
        	   break;
        case 2:int n0= sc.nextInt();
        		int n2 = sc.nextInt();
        		System.out.println(n0*n2);
        		break;
        case 3:int b = sc.nextInt();
        		int h = sc.nextInt();
         		System.out.println((b*h)/2);
        		break;
        case 4:int n1 = sc.nextInt();
        		double result=3.14*n1*n1;
                System.out.println(result);
        		break;
      }
 }
}