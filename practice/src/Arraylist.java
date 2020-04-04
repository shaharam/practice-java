import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        System.out.println(fruits.size());  // Size
        System.out.println(fruits);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.remove(1);   //remove gets index
        System.out.println(fruits);
        fruits.add("Kiwi");
        Collections.sort(fruits);   // Sorting
        System.out.println(fruits);
    }
}
