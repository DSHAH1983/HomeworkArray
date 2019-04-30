public class NumberOfWordsAndSpaces
{
    public static void main(String...s)
    {
        int word=1;
        String str="My aim is to become an automation tester";

        for(int i=0;i<str.length();++i)
        {
            if(str.charAt(i)==' ')
                word++;
        }
        System.out.println("The sentence is : My aim is to become an automation tester");
        System.out.println("Number of words = "+ word);
        System.out.println("Number of spaces = "+ (word-1));
    }
}

