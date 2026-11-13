class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int idp[]=new int[n];
        int ddp[]=new int[n];
        Arrays.fill(idp,1);
        Arrays.fill(ddp,1);
        int max=1;
        for(int i=1;i<=n-1;i++){
            if(nums[i-1]<nums[i]){
                idp[i]=idp[i-1]+1;
                
            }
            if(nums[i-1]>nums[i]){
                ddp[i]=ddp[i-1]+1;
            }
            max=Math.max(max,Math.max(idp[i],ddp[i]));
        }
        return max;

    }
}