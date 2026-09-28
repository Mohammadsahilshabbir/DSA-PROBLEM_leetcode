class Solution {
    public int integerBreak(int n) {

        int[] dp = new int[n + 1];

        dp[1] = 1;

        for(int i = 2; i <= n; i++) {

            for(int j = 1; j < i; j++) {

                int direct = j * (i - j);

                int broken = j * dp[i - j];

                dp[i] = Math.max(dp[i],
                                 Math.max(direct, broken));
            }
        }

        return dp[n];
    }
}