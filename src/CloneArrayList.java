import java.util.ArrayList;

public class CloneArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Dhara");
        c1.add("Keyur");
        c1.add("Aaliya");
        c1.add("Aryan");
        c1.add("Desai");
        System.out.println("Original array list: " + c1);

        //using inbuilt clone method to clone original arraylist
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newc1);
    }
}
