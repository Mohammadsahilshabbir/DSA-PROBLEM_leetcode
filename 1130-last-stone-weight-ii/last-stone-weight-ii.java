class Solution {
    public int lastStoneWeightII(int[] stones) {
         int sum = 0;

        for (int x : stones) {
            sum += x;
        }

        int target = sum / 2;

        Integer[][] dp = new Integer[stones.length][target + 1];

        for (int s = target; s >= 0; s--) {

            if (solve(stones, 0, s, dp) == 1) {
                return sum - 2 * s;
            }
        }

        return 0;
    }

    int solve(int[] stones, int i, int target, Integer[][] dp) {

        if (target == 0) {
            return 1;
        }

        if (i == stones.length || target < 0) {
            return 0;
        }

        if (dp[i][target] != null) {
            return dp[i][target];
        }

        int take = solve(stones, i + 1, target - stones[i], dp);

        int notTake = solve(stones, i + 1, target, dp);

        return dp[i][target] = Math.max(take, notTake);
    }
}