class Solution {
    public int numSquares(int n) {
        int maxsq=(int)Math.sqrt(n);
        Integer[][] dp=new Integer[maxsq+1][n+1];
        int ans = helper(maxsq,n, dp);
        if(n==Integer.MAX_VALUE) return -1;
        return ans; 
    }
    public int helper(int i,int n,Integer[][] dp){
        if(n==0) return 0;
        if(i==0) return Integer.MAX_VALUE;
        if(dp[i][n]!=null) return dp[i][n];
        int sq=i*i;
        int take=Integer.MAX_VALUE;
        if(sq <= n) {
            take = 1+helper(i, n - sq, dp);
        }
        int notTake = helper(i - 1, n, dp);
        return dp[i][n]=Math.min(take,notTake);
        }
}