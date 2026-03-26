class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int n=nums.length;
        // int low=0,high=n-1,idx1=-1,idx2=-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(nums[mid]==target){
        //         idx1=mid;
        //         high=mid-1;
        //     }
        //     else if(nums[mid]<target){
        //         low=mid+1;
        //     }else{
        //         high=mid-1;
        //     }
        // }
        // low=0;
        // high=n-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(nums[mid]==target){
        //         idx2=mid;
        //         low=mid+1;
        //     }
        //     else if(nums[mid]<target){
        //         low=mid+1;
        //     }else{
        //         high=mid-1;
        //     }
        // }
        
        
        // return new int[] {idx1,idx2};
        int[] a = new int[2];
        a[0] = -1;
        a[1] = -1;
             for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == target){
                a[1] = i;
            }
         }

         for(int i = nums.length - 1 ; i >= 0 ; i--){
            if(nums[i] == target){
                a[0] = i;
            }
         }
        return a;
    }
}
