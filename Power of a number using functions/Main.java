import java.util.Scanner;
class Main
{
  public static void main(String args[])
   {
    Scanner sc = new Scanner (System.in);
    int base = sc.nextInt();
    int expo= sc.nextInt();
    int powerr = power(base,expo);
    System.out.println(powerr);
  }
 
  public static int power(int base,int expo)
  {
    int pow=1;
    while(expo>0)
    {
      pow = pow * base;
      expo--;
    }
    return pow;
  }
}