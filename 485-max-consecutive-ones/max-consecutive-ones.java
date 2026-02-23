class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxc=0;
            for(int j=0;j<n;j++){
                if(nums[j]!=0){
                    count++;
                    maxc = Math.max(maxc, count);
                }else{
                    count=0;
                }
            
         
        }
        return maxc;
    }
}