class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;

        // int idx=nums[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) {
                // idx=nums[mid];
                return mid;
            }
            else if(nums[mid]<target){
                // start=nums[mid]+1;
                start=mid+1;
            }else{
                // end=nums[mid]-1;
                end=mid-1;
            }
        }
        return start;
    }
}