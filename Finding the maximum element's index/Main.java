import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
   int max_idx;
    if(a[0]>a[1])
    {
      max_idx=0;
    }
    else
    {
      max_idx=1;
    }
    for(int i=2;i<=(n-1);i++)
    {
      if(a[max_idx]<a[i])
      {
        max_idx=i;
      }
     
    }
    System.out.println(max_idx);
    
    
  }
}