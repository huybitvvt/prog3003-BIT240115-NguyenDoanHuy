package ExThree;
import java.util.function.Predicate;

public class Bai3 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("4 là số chẵn? " + isEven.test(4));
        System.out.println("7 là số chẵn? " + isEven.test(7));
    }
}
