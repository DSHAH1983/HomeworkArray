import java.util.Arrays;
import java.util.Scanner;

public class ContainsSpecificValue {
    public static void main(String[] args) {
        String find;
        Scanner sc = new Scanner(System.in);
        String[] arrayOfNames = new String[5];
        System.out.println("Enter any 5 names: ");

        for (int i = 0; i < arrayOfNames.length; i++)
        {
            arrayOfNames[i] = sc.nextLine();
        }

        System.out.println("Enter any existing or non existing name from above list: ");
        find = sc.nextLine();
        boolean found = Arrays.stream(arrayOfNames).anyMatch(t -> t.equals(find));

        if (found)
            System.out.println(find + " is found.");
        else
            System.out.println(find + " is not found.");
    }
}