class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] dp=new Integer[coins.length+1][amount+1];
        int ans = helper(coins, amount, coins.length - 1, dp);
        
        return ans;

    }
    public int helper(int[] coins,int amount,int i,Integer[][] dp){
        if(amount==0) return 1;
        if(i < 0) return 0;
        if(dp[i][amount]!=null) return dp[i][amount];
        int take=0;
        if(coins[i] <= amount) {

           take =helper(coins, amount - coins[i], i, dp);
            
        }
        int notTake=helper(coins,amount,i-1,dp);
        return dp[i][amount]=(take+notTake);
    }
}