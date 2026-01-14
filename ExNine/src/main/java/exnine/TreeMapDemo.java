package exnine;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();

        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        System.out.println(products);

        Map<String, Double> sub = products.subMap("K", true, "M", true);
        System.out.println(sub);
    }
}
