class MyThread extends Thread {

    public void run() {
        System.out.println("Thread đang chạy...");
    }
}

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable đang chạy...");
    }
}

public class Bai1 {
    public static void main(String[] args) {

    
        MyThread thread1 = new MyThread();
        thread1.start();

      
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
