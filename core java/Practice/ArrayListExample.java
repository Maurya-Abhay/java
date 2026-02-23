package Practice;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {

        // ArrayList dynamic array hoti hai
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Sorting
        Collections.sort(list);

        // Iteration
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}