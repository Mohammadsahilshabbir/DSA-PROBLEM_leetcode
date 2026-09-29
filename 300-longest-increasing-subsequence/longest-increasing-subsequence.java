class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int max=0;
        int[] dp=new int[n+1];
        for(int i=n-1;i>=0;i--){
            dp[i]=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
