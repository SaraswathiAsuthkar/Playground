import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
      int n= sc.nextInt();
      int arr[]= new int[n];
      int r=0;
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=1;i<=n-1;i++)
      {   
        if(arr[i-1]==arr[n-i])
           r=1;
        else
          r=-1;
      }
      if(r==1)
        System.out.println("Yes");
      else
      System.out.println("No");
    }
}