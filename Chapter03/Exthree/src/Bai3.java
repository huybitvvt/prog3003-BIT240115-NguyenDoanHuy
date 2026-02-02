import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Bai3 {
    public static void main(String[] args) {

    
        CompletableFuture<int[]> future =
                CompletableFuture.supplyAsync(() -> {
                    int[] arr = {1, 2, 5, 3, 100};
                    return arr;
                });

        
        CompletableFuture<List<Integer>> future2 =
                future.thenApply(arr -> {
                    List<Integer> result = new ArrayList<>();

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 != 0) {
                            result.add(arr[i]);
                        }
                    }

                    Collections.sort(result);
                    return result;
                });

        
        CompletableFuture<String> future3 =
                future2.thenApply(list -> {
                    String s = "Kết quả là: " + list;
                    return s;
                });

        
        future3.thenAccept(kq -> {
            System.out.println(kq);
        });

        future3.join();
    }
}
