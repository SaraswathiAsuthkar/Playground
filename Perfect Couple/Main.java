import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int arr[] = new int[n];
       for(int i = 0; i <= n - 1; i++)
       {
           arr[i] = in.nextInt();
       }
       int value = in.nextInt();
       // Function call
       perfect_couple(n, arr, value);
    }
    // Perfect couple function definition
    public static void perfect_couple(int n, int arr[], int value)
    {
        for(int index1 = 0; index1 <= n - 1; index1++)
        {
            for(int index2 = index1 + 1; index2 <= n - 1; index2++)
            {
                int sum = arr[index1] + arr[index2];
                if(sum == value)
                {
                    System.out.println(arr[index1] + "," + " " + arr[index2]);
                }
            }
        }
    }
}