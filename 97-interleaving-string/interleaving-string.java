class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m=s1.length();
        int n=s2.length();
        Boolean[][] dp=new Boolean[m+1][n+1];

        if(m+n!=s3.length()) return false;

        return helper(m,n,s1,s2,s3,dp);
    }
    public boolean helper(int i,int j,String s1, String s2, String s3,Boolean[][] dp){
        if(i==0 && j==0) return true;

        boolean first=false;
        boolean sec=false;

        if(dp[i][j]!=null) return dp[i][j];
        if(i>0 && s1.charAt(i-1)==s3.charAt(i+j-1)){
            first=helper(i-1,j,s1,s2,s3,dp);
        }
        if(j>0 && s2.charAt(j-1)==s3.charAt(i+j-1)){
            sec=helper(i,j-1,s1,s2,s3,dp);
        }
        return dp[i][j]=first||sec;
    }
}