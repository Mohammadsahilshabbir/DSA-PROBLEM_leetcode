class Solution {
public:
    int minMoves(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int move=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            move=move+nums[n-1]-nums[i];
        }
        return move;
    }
};