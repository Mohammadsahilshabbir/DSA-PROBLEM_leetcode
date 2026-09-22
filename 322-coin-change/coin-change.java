class Solution {

    public int coinChange(int[] coins, int amount) {
        Integer[][] dp=new Integer[coins.length+1][amount+1];
        int ans = helper(coins, amount, coins.length - 1, dp);
        if(ans >= 10000000)
            return -1;
        return ans;

    }
    public int helper(int[] coins,int amount,int i,Integer[][] dp){
        if(amount==0) return 0;
        if(i<0) return 100000000;
        if(dp[i][amount]!=null) return dp[i][amount];
        int take = 100000000;
        if(coins[i] <= amount) {

            take =1+ helper(coins, amount - coins[i], i, dp);
            
        }
        int notTake=helper(coins,amount,i-1,dp);
        return dp[i][amount]=Math.min(take,notTake);
    }
}