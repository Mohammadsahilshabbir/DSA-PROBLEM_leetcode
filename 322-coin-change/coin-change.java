class Solution {

    public int coinChange(int[] coins, int amount) {
        Integer[][] dp=new Integer[coins.length+1][amount+1];
        int ans = helper(coins, amount, coins.length - 1, dp);

        if(ans == Integer.MAX_VALUE)
            return -1;

        return ans;

    }
    public int helper(int[] coins,int amount,int i,Integer[][] dp){
        if(amount==0) return 0;
        if(i<0) return Integer.MAX_VALUE;
        if(dp[i][amount]!=null) return dp[i][amount];
        int take = Integer.MAX_VALUE;
        if(coins[i] <= amount) {

            int result = helper(coins, amount - coins[i], i, dp);

            if(result != Integer.MAX_VALUE)
                take = 1 + result;
        }
        int notTake=helper(coins,amount,i-1,dp);
        return dp[i][amount]=Math.min(take,notTake);
    }
}