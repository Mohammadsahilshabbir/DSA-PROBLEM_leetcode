class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int negcount=0;
        for(int nc:nums){
            if(nc==0) return 0;
            else if(nc<0) negcount++;
        }
        if (negcount%2==0) return 1;
        else return -1;
    }
}