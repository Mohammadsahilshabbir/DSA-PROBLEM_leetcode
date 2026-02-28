class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        for (int n : nums){
            count ^= n;
        }
        
        return count;
    }
}