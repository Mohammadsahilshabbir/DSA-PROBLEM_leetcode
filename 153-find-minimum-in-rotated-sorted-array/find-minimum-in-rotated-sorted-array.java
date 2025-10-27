// class Solution {
//     public int findMin(int[] nums) {
//         int min=Integer.MAX_VALUE;
//         int start=0;
//         int end=nums.length-1;
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(nums[mid]==min) return mid;
//             else if(nums[start]<=nums[mid]){ //first part is sorted
//             if(nums[start]<=min && nums[mid]>min){
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }
//             }else{
//                 if(min>nums[mid]&&min<nums[end]){
//                     end=mid-1;
//                 }
//             }
//         }
//         return min;
//     }
// }


class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            // If mid element is greater than the last element,
            // minimum must be in the right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // Otherwise, it's in the left half (including mid)
                end = mid;
            }
        }

        // When start == end, it points to the minimum element
        return nums[start];
    }
}
