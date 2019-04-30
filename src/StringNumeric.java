import java.util.Arrays;
import java.util.Scanner;

public class StringNumeric
{ public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // Defining String to get input of names from user
    String[] arrayOfNames = new String[5];
    System.out.println("Please enter 5 names to sort - ");

    // Using for-loop to define the index of user input
    for (int i = 0; i < arrayOfNames.length; i++)
    {
        arrayOfNames[i] = s.nextLine();
    }

    // Defining Numeric array to get input from user
    Integer[] arrayOfNum = new Integer[5];
    System.out.println("Please enter 5 numbers to sort - ");

    // Using for-loop to define the index of user input
    for(int j = 0; j<arrayOfNum.length; j++)
    {
        arrayOfNum[j] = s.nextInt();
    }

        System.out.println("Original string array : "+ Arrays.toString(arrayOfNames));
        Arrays.sort(arrayOfNames);
        System.out.println("Sorted string array : "+Arrays.toString(arrayOfNames));

        System.out.println("Original numeric array : "+Arrays.toString(arrayOfNum));
        Arrays.sort(arrayOfNum);
        System.out.println("Sorted numeric array : "+Arrays.toString(arrayOfNum));
    }
}

