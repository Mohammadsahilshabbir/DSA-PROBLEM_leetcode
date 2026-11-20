class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int i, int xor) {
        if (i == nums.length) {
            return xor;
        }

        int include = dfs(nums, i + 1, xor ^ nums[i]);
        int exclude = dfs(nums, i + 1, xor);

        return include + exclude;
    }
}