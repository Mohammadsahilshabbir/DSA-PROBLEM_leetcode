class Solution {
    public int palindromePartition(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n][k + 1];

        for (int[] dps : dp) {
            Arrays.fill(dps, -1);
        }

        return helper(0, k, s, dp);
    }

    public int helper(int i, int k, String s, int[][] dp) {
        int n = s.length();

        if (k == 1) {
            return changes(s, i, n - 1);
        }

        if (dp[i][k] != -1) {
            return dp[i][k];
        }

        int result = Integer.MAX_VALUE;

        for (int j = i; j <= n - k; j++) {
            int curr = changes(s, i, j);
            int rem = helper(j + 1, k - 1, s, dp);

            int total = curr + rem;
            result = Math.min(result, total);
        }

        return dp[i][k] = result;
    }

    public int changes(String s, int i, int j) {
        int count = 0;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                count++;
            }

            i++;
            j--;
        }

        return count;
    }
}