package exone;

class Test<T> {
    private T value;

    public void set(T t) {
        this.value = t;
    }

    public T get() {
        return value;
    }
}

public class TestGeneric {
    public static void main(String[] args) {
        Test<Integer> intTest = new Test<>();
        intTest.set(123);
        System.out.println("Integer value: " + intTest.get());

        Test<String> stringTest = new Test<>();
        stringTest.set("Hello Java");
        System.out.println("String value: " + stringTest.get());
    }
}
