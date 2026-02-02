class InSo extends Thread {

    public InSo(String tenThread) {
        setName(tenThread);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("lỗi khi sleep");
            }
        }
    }
}

public class Bai2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            InSo t = new InSo("Thread " + i);
            t.start();
        }
    }
}
