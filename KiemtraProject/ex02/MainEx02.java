package ex02;

import ex01.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MainEx02 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("SV01", "An", 3.5));
        list.add(new Student("SV02", "Binh", 3.2));
        list.add(new Student("SV03", "Cuong", 2.8));

        System.out.println("Dang tinh GPA trung binh...");

        CompletableFuture<Double> future = AsyncGpaCalculator.calculateAsync(list);

        future.thenAccept(avg -> {
            System.out.println("GPA trung binh: " + avg);
        });

        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
