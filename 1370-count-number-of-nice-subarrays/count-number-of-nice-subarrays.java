class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

    return countAtMost(nums, k) - countAtMost(nums, k - 1);


    }

    public static int countAtMost(int[] arr, int k) {
        int count = 0;
        int end=0;
        int start=0;
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[end] % 2 != 0) {
                count++;
            }
            end++;

            while (count > k) {

                if (arr[start] % 2 != 0) {
                    count--;
                }

                start++;
            }
            res += end - start + 1;

        }

        return res;
    }
}