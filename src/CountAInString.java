import java.util.Scanner;

public class CountAInString {
    public static void main(String[] args)
    {
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        word=sc.nextLine();

        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("Number of 'a' in the word " + word + " is: " +count);

    }
}

