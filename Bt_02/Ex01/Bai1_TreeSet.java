package Ex01;

import java.util.TreeSet;

public class Bai1_TreeSet {

    public static void main(String[] args) {

       
        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

       
        System.out.println("danh sách sau khi sắp xếp:");
        for (String name : names) {
            System.out.println(name);
        }

        
        System.out.println("phần tử nhỏ nhất: " + names.first());
        System.out.println("phần tử lớn nhất: " + names.last());
    }
}