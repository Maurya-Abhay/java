package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // Key-Value pair store karta hai
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Aman");
        map.put(2, "Rahul");
        map.put(3, "Sita");

        // entrySet se iterate karte hain
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                    ", Value: " + entry.getValue());
        }
    }
}
