package ExFive;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Bai5 {
    public static void main(String[] args) {

        Supplier<Double> randomNumber = () -> Math.random() * 100;

        Consumer<Double> printNumber =
                n -> System.out.println("Số may mắn: " + n);

        Double number = randomNumber.get();
        printNumber.accept(number);
    }
}
