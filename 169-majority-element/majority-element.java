class Solution {
    public int majorityElement(int[] nums) {
        int key = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                key = num;
            }
            if(num==key) count++;
            else count--;
        }
        return key;

    }
}