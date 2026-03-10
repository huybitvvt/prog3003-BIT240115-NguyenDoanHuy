package Ex03;

import java.util.concurrent.CompletableFuture;

public class Bai3_MovieBooking {

    // xác thực
    public static CompletableFuture<String> validateCustomer() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("đã xác thực khách hàng");
            return "OK";
        });
    }

    public static CompletableFuture<String> issueTicket() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("đã xuất vé");
            return "OK";
        });
    }

    public static void main(String[] args) {

        CompletableFuture<String> task1 = validateCustomer();
        CompletableFuture<String> task2 = issueTicket();

        
        CompletableFuture<String> result =
                task1.thenCombine(task2,
                        (a, b) -> "Hoàn thành hệ thống đặt vé");

       
        System.out.println(result.join());
    }
}
