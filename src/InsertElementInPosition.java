import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class InsertElementInPosition
{public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    Integer[] arrayNumber = new Integer[5];
    System.out.print("Please enter any 5 numbers with space between them : ");

    for (int j = 0; j < arrayNumber.length; j++)
    {
        arrayNumber[j] = scanner.nextInt();
    }

    // Insert an element for Index position of the array
    System.out.print("Enter any number between 0 to 4 : ");
    int Index_position = scanner.nextInt();

    // Insert an element for Index position of the array
    System.out.print("Enter any number : ");
    int newValue = scanner.nextInt();

    System.out.println("Original Array : " + Arrays.toString(arrayNumber));

    for (int i = arrayNumber.length - 1; i > Index_position; i--)
    {
     arrayNumber[i] = arrayNumber[i - 1];
    }
            arrayNumber[Index_position] = newValue;
            System.out.println("New Array with new value : " + Arrays.toString(arrayNumber));
        }
    }



