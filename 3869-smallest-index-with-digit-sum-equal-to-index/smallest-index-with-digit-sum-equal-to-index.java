class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=helper(nums[i]);
            if(sum==i){
                return sum;
            }
        }
        return -1;
    }
    public int helper(int n){
        if(n==0) return 0;
        return (n%10)+helper(n/10);
    }
}