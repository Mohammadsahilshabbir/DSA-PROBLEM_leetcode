class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long sec_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max || nums[i] == sec_max || nums[i] == third_max)
                continue;
            if (nums[i] > max) {
                third_max = sec_max;
                sec_max = max;
                max = nums[i];
            } else if (nums[i] > sec_max && nums[i] != max) {
                third_max = sec_max;
                sec_max = nums[i];
            } else if (nums[i] > third_max && nums[i] != sec_max && nums[i] != max) {
                third_max = nums[i];
            }
        }
        return third_max == Long.MIN_VALUE ? (int) max : (int)third_max;

    }
}