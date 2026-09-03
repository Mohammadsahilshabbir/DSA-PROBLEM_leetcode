class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        if(n==1) return nums[0];
        Arrays.fill(dp,-1);
        int take=loot(0,n-2,nums,dp);
        Arrays.fill(dp,-1);
        int not =loot(1,n-1,nums,dp);
        int ans=Math.max(take,not);
        return ans;
    }
    public int loot(int i,int end,int nums[],int[] dp){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];

        int loot=nums[i]+loot(i+2,end,nums,dp);
        int not=loot(i+1,end,nums,dp);
        int ans=Math.max(loot,not);
        return dp[i]=ans;
    }
}