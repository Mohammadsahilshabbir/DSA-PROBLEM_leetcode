class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Integer[][] dp=new Integer[m][n];
        return helper(m-1,n-1,grid,dp);
    }
    public int helper(int i,int j,int[][] grid,Integer[][]dp){

        if(i<0||j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return grid[i][j];
        if(dp[i][j]!=null) return dp[i][j];
        int up=helper(i-1,j,grid,dp);
        int left=helper(i,j-1,grid,dp);
        return dp[i][j]=grid[i][j]+Math.min(up,left);
    }
}