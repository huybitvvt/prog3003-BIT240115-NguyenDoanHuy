package Bai3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bai3_StreamCollectors {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "An", 900));
        employees.add(new Employee(2, "Binh", 1500));
        employees.add(new Employee(3, "Cuong", 1200));
        employees.add(new Employee(4, "Dung", 800));

        List<String> result = employees.stream()
                .filter(emp -> emp.getSalary() > 1000)
                .map(Employee::getName)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println("Danh sách tên nhân viên lương > 1000:");
        result.forEach(System.out::println);
    }
}
