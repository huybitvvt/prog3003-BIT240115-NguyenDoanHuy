package bai3;

import java.util.concurrent.CompletableFuture;

public class BankSystem {

    public static void main(String[] args) {

        CompletableFuture<Boolean> authFuture =
                CompletableFuture.supplyAsync(() -> authenticate("khoa"));

        CompletableFuture<Boolean> balanceFuture =
                authFuture.thenCompose(authResult -> {

                    if (!authResult) {
                        throw new RuntimeException("Xác thực thất bại!");
                    }

                    return CompletableFuture.supplyAsync(() -> checkBalance(1000));
                });

        CompletableFuture<String> transactionFuture =
                balanceFuture.thenCompose(balanceOk -> {

                    if (!balanceOk) {
                        throw new RuntimeException("Không đủ số dư!");
                    }

                    return CompletableFuture.supplyAsync(() -> transferMoney(500));
                });

        transactionFuture
                .thenAccept(result -> System.out.println(result))
                .exceptionally(ex -> {
                    System.out.println("Giao dịch thất bại: " + ex.getMessage());
                    return null;
                })
                .join();
    }

    // === giả lập tác vụ ===

    public static boolean authenticate(String user) {
        sleep(2);
        System.out.println("Đang xác thực người dùng...");
        return true; 
    }

    public static boolean checkBalance(double balance) {
        sleep(3);
        System.out.println("Đang kiểm tra số dư...");
        return balance >= 500;
    }

    public static String transferMoney(double amount) {
        sleep(1);
        return "chuyển tiền thành công: " + amount;
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
