class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int move=0;
        for(int i=0;i<n;i++){
            move=move+nums[n-1]-nums[i];
        }
        return move;
    }
}