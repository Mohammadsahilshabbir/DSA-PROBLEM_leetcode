class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int end = 0;
        for (end = 0; end < nums.length; end++) {

            int sum = 0;

            for (int j = end; j < nums.length; j++) {

                sum =sum + nums[j];

                if (sum == goal) {
                    count++;
                }
            }
        }

        return count;
    }
}