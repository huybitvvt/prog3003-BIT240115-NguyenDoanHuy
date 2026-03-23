package Bai1;

public class Bai1_GenericMethod {

// Phương thức generic static
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"Java", "NetBeans", "Generic", "Method"};

        System.out.println("Mảng Integer:");
        printArray(numbers);

        System.out.println("\nMảng String:");
        printArray(words);
    }
}
