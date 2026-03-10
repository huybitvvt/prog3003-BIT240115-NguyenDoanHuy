package Ex02;

public class Bai2_BuilderTest {

    public static void main(String[] args) {

       // có bluetooth
        Computer computer1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .build();

        // ko có bluetooth
        Computer computer2 = new Computer.ComputerBuilder("512GB", "8GB")
                .build();

        computer1.showInfo();
        computer2.showInfo();
    }
}
