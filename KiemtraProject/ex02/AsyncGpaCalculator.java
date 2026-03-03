package ex02;

import ex01.Student;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AsyncGpaCalculator {

    public static double calculateAverageGpa(List<Student> students) {
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }

    public static CompletableFuture<Double> calculateAsync(List<Student> students) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return calculateAverageGpa(students);
        });
    }
}
