package exsix;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 2, 5, 8, 1};
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            set.add(n);
        }

        // HashSet không đảm bảo thứ tự vì dùng cơ chế hash
        System.out.println(set);
    }
}
