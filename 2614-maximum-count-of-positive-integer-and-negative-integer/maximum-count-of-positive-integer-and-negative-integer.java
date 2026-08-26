class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>=0) hi=mid-1;
            else{
                lo=mid+1;
            }
        }
        int negcount=lo;
        
        lo=0;
        hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
        if(nums[mid]<=0) lo=mid+1;
            else{
                hi=mid-1;
            }
        }
       int poscount=n-lo;
       if(poscount>=negcount) return poscount;
       else return negcount;
    }
        
    }

