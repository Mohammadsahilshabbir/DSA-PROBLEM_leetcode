class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length , i = 0 , j = n - 1;
        
        
        
        while(i<j){
             int  mid = i + ( j - i )/ 2;
            if(mid%2==1) mid--;
            if(nums[mid]==nums[mid+1]) i=mid+2;
            
            else{
                j = mid;
            }        
        }
        return nums[i];
    }
}