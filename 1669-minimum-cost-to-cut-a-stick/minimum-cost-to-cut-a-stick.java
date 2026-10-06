class Solution {
    public int minCost(int n, int[] cuts) {
        int m=cuts.length;
        int[] arr=new int[m+2];
        arr[0]=0;
        arr[m+1]=n;
        for(int i=0;i<cuts.length;i++){
            arr[i+1]=cuts[i];
        }
        Arrays.sort(arr);
        int[][] dp=new int[m+2][m+2];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(1,m,dp,arr);

    }
    public int helper(int i,int j,int dp[][],int[]arr){
        if(i>j) return 0;
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
        int len=arr[j+1]-arr[i-1];
        int cost=helper(i,k-1,dp,arr)+helper(k+1,j,dp,arr)+len;
        min=Math.min(min,cost);
        }
        return dp[i][j]=min;
    }
}