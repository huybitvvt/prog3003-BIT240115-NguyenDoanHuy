package ex01;

public class MainEx01 {
    public static void main(String[] args) {
        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV01", "An", 3.5));
        manager.add(new Student("SV02", "Binh", 3.2));
        manager.add(new Student("SV03", "Cuong", 2.8));

        System.out.println("=== DANH SACH SINH VIEN ===");
        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}
