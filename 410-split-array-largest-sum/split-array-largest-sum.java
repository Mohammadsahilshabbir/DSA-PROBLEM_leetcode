class Solution {
    public int splitArray(int[] nums, int k) {
        int[][] dp=new int[nums.length][k+1];
        for(int[] dps:dp){
            Arrays.fill(dps,-1);
        }
        return helper(0,k,nums,dp);
    }
    public int helper(int i,int k,int[]nums,int[][] dp){
        int n=nums.length;
        if(dp[i][k]!=-1) return dp[i][k];
        if(k==1){
            int sum=0;
            for(int t=i;t<n;t++){
                sum+=nums[t];
            }return sum;
        }
        int currsum=0;
        int result=Integer.MAX_VALUE;
        for(int j=i;j<=n-k;j++){
            currsum=currsum+nums[j];
            int remsum=helper(j+1,k-1,nums,dp);
            int largesum=Math.max(currsum,remsum);
            result=Math.min(result,largesum);
        }
        return dp[i][k]=result;
    }
}