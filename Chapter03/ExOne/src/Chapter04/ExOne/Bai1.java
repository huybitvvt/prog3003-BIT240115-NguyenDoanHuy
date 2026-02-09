package ExOne;
@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}

public class Bai1 {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;

        System.out.println("Cộng: " + add.compute(10, 5));
        System.out.println("Trừ: " + sub.compute(10, 5));
        System.out.println("Nhân: " + mul.compute(10, 5));
        System.out.println("Chia: " + div.compute(10, 5));
    }
}
