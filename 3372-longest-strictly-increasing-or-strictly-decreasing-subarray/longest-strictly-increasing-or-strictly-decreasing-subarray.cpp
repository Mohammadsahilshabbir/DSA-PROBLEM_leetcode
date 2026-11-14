class Solution {
public:
    int longestMonotonicSubarray(vector<int>& nums) {
        int n=nums.size();
        vector<int> idp(n,1);
        vector<int> ddp(n,1);
        int max1=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                idp[i]=idp[i-1]+1;
            }
            if(nums[i-1]>nums[i]){
                ddp[i]=ddp[i-1]+1;
            }
            max1=max(max1,max(idp[i],ddp[i]));
        }
        return max1;
    }
}; 