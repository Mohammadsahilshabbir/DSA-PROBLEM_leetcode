class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        // int i=0,j=n-1;
        boolean dec=true;
        boolean inc=true;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                dec=false;
            }
            if(nums[i]<nums[i-1]){
                inc=false;
            }
        }

        // while(i<j){
        //     int mid=(i+j)/2;
        //     if(nums[i]<=nums[mid] && nums[j]<=nums[mid]){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        return inc||dec;
    }
}