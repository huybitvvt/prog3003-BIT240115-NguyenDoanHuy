package bai1;
import java.util.*;

public class Main {
    private static ArrayList<Student> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. thêm sinh viên");
            System.out.println("2. hiển thị danh sách");
            System.out.println("3. Tìm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> showAll();
                case 3 -> searchByName();
                case 4 -> deleteByMssv();
                case 0 -> {
                    System.out.println("Thoát chương trình!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Nhập MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        list.add(new Student(mssv, name, gpa));
        System.out.println("Thêm thành công!");
    }

    private static void showAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        list.forEach(System.out::println);
    }

    private static void searchByName() {
        System.out.print("Nhập tên cần tìm: ");
        String name = sc.nextLine();

        list.stream()
            .filter(s -> s.getName().toLowerCase().contains(name.toLowerCase()))
            .forEach(System.out::println);
    }

    private static void deleteByMssv() {
        System.out.print("Nhập MSSV cần xóa: ");
        String mssv = sc.nextLine();

        boolean removed = list.removeIf(s -> s.getMssv().equals(mssv));
        System.out.println(removed ? "Đã xóa!" : "Không tìm thấy MSSV!");
    }
}
