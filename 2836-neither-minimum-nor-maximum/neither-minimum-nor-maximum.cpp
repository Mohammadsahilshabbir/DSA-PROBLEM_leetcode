class Solution {
public:
    int findNonMinOrMax(vector<int>& nums) {
        int n = nums.size();

        if (n == 1 || n == 2)
            return -1;

        sort(nums.begin(), nums.end());

        if (n == 3) {
            return nums[1];
        } else {
            return nums[2];
        }
    }
};