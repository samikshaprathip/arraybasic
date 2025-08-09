import java.util.*;
public class powerOfTwo {
    static boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
    public static int countPairs(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPowerOfTwo(arr[i] + arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        System.out.println(countPairs(arr));
    }
}
