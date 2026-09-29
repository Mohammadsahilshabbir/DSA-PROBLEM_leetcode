class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {

        int n = nums.length;

        int[] dp = new int[n];
        int[] parent = new int[n];

        Arrays.fill(parent, -1);

        Arrays.sort(nums);

        int last = 0;

        for(int i = n - 1; i >= 0; i--) {

            dp[i] = 1;

            for(int j = i + 1; j < n; j++) {

                if(nums[j] % nums[i] == 0) {

                    int old = dp[i];

                    dp[i] = Math.max(dp[i], 1 + dp[j]);

                    if(dp[i] != old) {
                        parent[i] = j;
                    }
                }
            }

            if(dp[i] > dp[last]) {
                last = i;
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(last != -1) {

            ans.add(nums[last]);
            last = parent[last];
        }

        return ans;
    }
}