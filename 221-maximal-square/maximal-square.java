class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Integer[][] dp=new Integer[m][n];
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                max=Math.max(max,helper(i,j,matrix,dp));
                }
            }
        }
        return max*max;
    }
    public int helper(int i,int j,char [][] matrix,Integer[][] dp){
        if(i>=matrix.length||j>=matrix[0].length) return 0;
        if(matrix[i][j]=='0') return 0;
        if(dp[i][j]!=null) return dp[i][j]; 

        int down=helper(i+1,j,matrix,dp);
        int right=helper(i,j+1,matrix,dp);
        int diag=helper(i+1,j+1,matrix,dp);

        dp[i][j] = 1 + Math.min(diag,Math.min(down,right));
        return dp[i][j];
    }
}