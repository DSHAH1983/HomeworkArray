import java.util.Scanner;

public class DuplicateValueOfArrayInteger
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arrayNumber = new Integer[6];
        System.out.print("Please enter any 6 numbers with space by repeating any two numbers  : ");

        for (int a = 0; a < arrayNumber.length; a++) {
            arrayNumber[a] = scanner.nextInt();}

            for (int i = 0; i < arrayNumber.length - 1; i++) {
                for (int j = i + 1; j < arrayNumber.length; j++) {
                    if ((arrayNumber[i] == arrayNumber[j]) && (i != j)) {
                        System.out.println("Duplicate Element : " + arrayNumber[j]);
                    }


                }}}}
