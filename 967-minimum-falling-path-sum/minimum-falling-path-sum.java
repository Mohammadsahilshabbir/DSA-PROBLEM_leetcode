class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Integer[][] dp=new Integer[m][n];
        
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            ans=Math.min(ans,helper(0,j,matrix,dp));
        }
        return ans;
    }
    public int helper(int i,int j,int[][] matrix,Integer[][]dp){
        int m = matrix.length;
        int n = matrix[0].length;
        if (j < 0 || j >= n) return Integer.MAX_VALUE;
        if(i==n-1) return matrix[i][j];
        if(dp[i][j]!=null) return dp[i][j];

        int down=helper(i+1,j-1,matrix,dp);
        int left=helper(i+1,j,matrix,dp);
        int right=helper(i+1,j+1,matrix,dp);

        dp[i][j] =matrix[i][j]+Math.min(down,Math.min(left,right));
        return dp[i][j];
    }
}