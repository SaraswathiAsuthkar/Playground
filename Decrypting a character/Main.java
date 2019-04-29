import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      char ch = sc.next().charAt(0);
      int key = sc.nextInt();
      if(ch>='a' && ch<='z')
      {
       ch = (char)(ch - key + 26);
        System.out.println(ch);
      }
      else
      {
        ch = (char)(ch - key);
        System.out.println(ch);
        }
    }
}