class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        int[] dp = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            int prev = arr[i] - difference;

            dp[i] = map.getOrDefault(prev, 0) + 1;

            map.put(arr[i], dp[i]);

            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}