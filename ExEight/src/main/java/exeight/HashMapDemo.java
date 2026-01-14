package exeight;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Anna");
        map.put(102, "Peter");
        map.put(103, "Mary");

        System.out.println("ID 102: " + map.get(102));

        if (!map.containsKey(105)) {
            map.put(105, "Unknown");
        }

        System.out.println(map);
    }
}
