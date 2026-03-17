package Ex03;

public class MainThread {
    public static void main(String[] args) {

        // Thread
        WorkerThread thread = new WorkerThread();
        thread.start();

        // Runnable
        Thread runnableThread = new Thread(new WorkerRunnable());
        runnableThread.start();

    }
}
