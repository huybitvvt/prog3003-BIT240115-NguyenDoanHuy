package Ex01;

import java.util.HashMap;
public class Bai1_HashMap {
    public static void main(String[] args) {

        // Tạo HashMap
        HashMap<Integer, String> employees = new HashMap<>();

     
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        
        String name = employees.get(102);
        System.out.println("nhân viên có ID 102: " + name);

        //  Kiểm tra ID 105
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        // In danh sách
        System.out.println("danh sách nhân viên:");
        System.out.println(employees);
    }
}
