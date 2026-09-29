class Solution {
    public int findNumberOfLIS(int[] nums) {

        int n = nums.length;
        int max = 0;
        int ans = 0;

        int[] dp = new int[n+1];
        int[] count = new int[n];

        for(int i = n-1; i >= 0; i--) {

            dp[i] = 1;
            count[i] = 1;

            for(int j = i+1; j < n; j++) {

                if(nums[i] < nums[j]) {

                    if(dp[i] < 1 + dp[j]) {

                        dp[i] = 1 + dp[j];
                        count[i] = count[j];

                    }
                    else if(dp[i] == 1 + dp[j]) {

                        count[i] += count[j];

                    }
                }
            }

            max = Math.max(max, dp[i]);
        }

        for(int i = 0; i < n; i++) {

            if(dp[i] == max) {
                ans += count[i];
            }
        }

        return ans;
    }
}