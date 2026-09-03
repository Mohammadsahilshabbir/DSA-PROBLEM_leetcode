class Solution {

    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-2);
        return helper(coins, amount,dp);
    }

    public int helper(int[] coins, int amount,int[] dp) {
        int n=coins.length;
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        if(dp[amount]!=-2)return dp[amount];

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {

          
            int result = helper(coins, amount - coin,dp);

        
            if (result != -1) {

                
                min = Math.min(min, result + 1);
            }
        }

        if (min == Integer.MAX_VALUE) {
            dp[amount]=-1;
            return -1;
        }else{
            dp[amount]=min;
            return min;
        }
    }
}