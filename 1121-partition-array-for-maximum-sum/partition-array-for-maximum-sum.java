class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(0,arr,dp,k);
    }
    public int helper(int i,int[] arr,int[]dp,int k){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int len=0;
        int max_num=-1;
        int result=Integer.MIN_VALUE;
        for(int j=i;j<arr.length&&j<i+k;j++){
            max_num=Math.max(max_num,arr[j]);
            len=j-i+1;
            int cost=max_num*len+helper(j+1,arr,dp,k);
            result=Math.max(result,cost);

        }
        return dp[i]=result;
    }
}