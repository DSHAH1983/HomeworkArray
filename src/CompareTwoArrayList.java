import java.util.ArrayList;

public class CompareTwoArrayList
{
    public static void main(String[] args) {
        ArrayList<String> fruits1 = new ArrayList<String>();
        fruits1.add("Orange");
        fruits1.add("Mango");
        fruits1.add("Apple");
        fruits1.add("Grapes");
        fruits1.add("Banana");
        fruits1.add("Apple");
        fruits1.add("Orange");


        ArrayList<String> fruits2 = new ArrayList<String>();
        fruits2.add("Papaya");
        fruits2.add("Mango");
        fruits2.add("Blueberry");
        fruits2.add("Grapes");
        fruits2.add("Banana");
        fruits2.add("Apple");
        fruits2.add("Dates");
        fruits2.add("Orange");
        System.out.println("Total fruits: "+fruits2.size());

        for(int i=0;i<fruits1.size();i++){
            if(fruits1.contains(fruits2.get(i))){
                System.out.println("Exist : "+fruits2.get(i));
            }else{
                System.out.println("Not Exist : "+fruits2.get(i));
            }
        }
    }
}
