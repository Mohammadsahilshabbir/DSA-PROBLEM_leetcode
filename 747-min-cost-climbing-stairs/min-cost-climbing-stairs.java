class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        // Write your code here
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minc(0,cost),minc(1,cost));
        
    }
    public int minc(int i,int cost[]){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int dojump=cost[i]+minc(i+2,cost);
        int ekjump=cost[i]+minc(i+1,cost);
        return dp[i]=Math.min(dojump,ekjump);
}
}