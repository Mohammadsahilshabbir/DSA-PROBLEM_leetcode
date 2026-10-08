class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        Integer[][] dp=new Integer[n+1][n+1];
        return helper(0,n-1,piles,dp)>=0;
    }
    public int helper(int i,int j,int[] piles,Integer[][] dp){
        if(i==j) return piles[i];
        if(dp[i][j]!=null) return dp[i][j];
        int left=piles[i]-helper(i+1,j,piles,dp);
        int right=piles[j]-helper(i,j-1,piles,dp);
        int result=Math.max(right,left);
        return dp[i][j]=result;
    }
}