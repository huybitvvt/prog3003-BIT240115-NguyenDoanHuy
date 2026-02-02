import java.util.concurrent.CompletableFuture;

public class Bai4 {

    public static void main(String[] args) {

        CompletableFuture<Void> kiemTraHang =
                CompletableFuture.runAsync(() -> {
                    cho(1000);
                    System.out.println("Đã kiểm tra sản phẩm");
                });

        CompletableFuture<Void> thanhToan =
                CompletableFuture.runAsync(() -> {
                    cho(1500);
                    System.out.println("thanh toán thành công");
                });

        CompletableFuture<Void> vanChuyen =
                CompletableFuture.runAsync(() -> {
                    cho(2000);
                    System.out.println("đơn hàng đang vận chuyển");
                });

        CompletableFuture<Void> tatCa =
                CompletableFuture.allOf(kiemTraHang, thanhToan, vanChuyen);

        tatCa.thenRun(() -> {
            System.out.println("Xử lý đơn hàng hoàn tất");
        });

        tatCa.join();
    }

    static void cho(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("lỗi sleep");
        }
    }
}
