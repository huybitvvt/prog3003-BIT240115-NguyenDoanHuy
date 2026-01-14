package ExFour;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");
        fruits.set(fruits.indexOf("Banana"), "Grapes");

        System.out.println("Apple exists? " + fruits.contains("Apple"));
        System.out.println(fruits);
    }
}
