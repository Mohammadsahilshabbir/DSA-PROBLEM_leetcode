class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int czero = 0;
        int maxL = 0;
        for(right = 0; right < n; right++){
            if(nums[right] == 0) czero++;
            while(czero > k) {
                if(nums[left] == 0)
                 czero--;
                left++;
            }
             maxL = Math.max(maxL, right - left + 1);
        }
        return maxL;
    }
}