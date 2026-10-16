import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int count = 0;
        boolean[] arr = new boolean[n];

        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                for (int j = i * 2; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                count++;
            }
        }

        return count;
    }
}