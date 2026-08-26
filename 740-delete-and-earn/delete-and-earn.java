class Solution {
    public int deleteAndEarn(int[] nums) {
       int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] points = new int[max + 1];
        for (int num : nums) {
            points[num] += num;
        }
        int take = 0, skip = 0;
        for (int i = 0; i <= max; i++) {
            int lega = skip + points[i]; 
            int nhilega = Math.max(skip, take); 
            take = lega;
            skip = nhilega;
        }

        return Math.max(take, skip);
    }
}