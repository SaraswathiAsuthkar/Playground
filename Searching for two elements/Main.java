import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner (System.in);
      int n= sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int s_ele1=sc.nextInt();
      int s_ele2=sc.nextInt();
      int index_1=-1;
      int index_2=-1;
      for(int i=0;i<n;i++)
      {
        if(s_ele1==a[i])
          index_1=i;
        if(s_ele2==a[i])
          index_2=i;
      }
      System.out.println(index_1);
      System.out.println(index_2);

    }
}