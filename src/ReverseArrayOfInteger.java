import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfInteger
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer[] arrayNumber = new Integer[5];
        System.out.print("Please enter any 5 numbers with space between them : ");

        for (int j = 0; j < arrayNumber.length; j++)
        {
            arrayNumber[j] = scanner.nextInt();
        }
        System.out.println("Original array : "+ Arrays.toString(arrayNumber));
        for(int i = 0; i < arrayNumber.length / 2; i++)
        {
            int temp = arrayNumber[i];
            arrayNumber[i] = arrayNumber[arrayNumber.length - i - 1];
            arrayNumber[arrayNumber.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(arrayNumber));
    }
}
