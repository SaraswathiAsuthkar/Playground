import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    batch(a,n);
  }
  public static void batch(int a[],int n)
  {
    int b_sum=a[0]+a[1]+a[2],b1_sum=0;
    for(int i=3;i<=(n-1);i=i+3)
     {
        b1_sum=a[i]+a[i+1]+a[i+2];
     }
       if(b1_sum==b_sum)
                          {
                            System.out.println("Perfect Batch");
                          }
                          else
                          {
                            System.out.println("Not a Perfect Batch");
                          }
                            
  }
}