import java.util.ArrayList;

public class ReplaceAnElementInArrayList
{
    public static void main(String[] args) {
    //create an ArrayList object
    ArrayList arrayList = new ArrayList();

    //Add elements to Arraylist
    arrayList.add("1");
    arrayList.add("2");
    arrayList.add("3");

    /*
      To replace an element at the specified index of ArrayList use
      Object set(int index, Object obj) method.
      This method replaces the specified element at the specified index in the
      ArrayList and returns the element previously at the specified position.
    */
    arrayList.set(1,"REPLACED ELEMENT");

    System.out.println("Original ArrayList contains: 1,2,3");

    System.out.println("New ArrayList after replacement of ArryaList contains: ");
    //display elements of ArrayList
    for(int index=0; index < arrayList.size(); index++)
        System.out.println(arrayList.get(index));

}
}
