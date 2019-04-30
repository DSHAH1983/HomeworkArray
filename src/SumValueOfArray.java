import java.util.Scanner;

public class SumValueOfArray
{
    public static void main(String[] args)
{

    int n, sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();

    // user to enter no. of array of their choice
    int a[] = new int[n];
    System.out.println("Enter any numbers:");

    // Using for-loop to define addition of numbers entered by user
    for(int i = 0; i < n; i++)
    {
        a[i] = s.nextInt();
        sum = sum + a[i];
    }
    System.out.println("Sum of entered numbers is "+sum);
}
}
