class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>ans=new HashSet<>();
        int sum=0;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(n==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]>0){
                ans.add(nums[i]);
            }
        }
        for(int num:ans){
            sum=Math.abs(sum+num);
        }
        if(ans.isEmpty()){
            return max;
        }
        return sum;
    }
}