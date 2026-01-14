package extwo;

public class PrintArray {

    public static <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] words = {"Java", "NetBeans", "Generic"};

        printArray(nums);
        printArray(words);
    }
}
