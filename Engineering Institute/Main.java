//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int base)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+base);
  }
}
class CSE extends Faculty
{
  public void salary(int base)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(base+3000));
  }
}
class IT extends Faculty
{
  public void salary(int base)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(base+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int base)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(base+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    if(base > 0)
    {
      Faculty f = new Faculty();
      f.salary(base);
       CSE c = new CSE();
      c.salary(base);
       IT i = new IT();
      i.salary(base);
    ECE obj = new ECE();
      obj.salary(base);
    }
    else
      System.out.println("NULL");
    //implement your required concept here
  }
}