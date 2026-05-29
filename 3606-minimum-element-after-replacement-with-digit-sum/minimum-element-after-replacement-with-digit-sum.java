class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            int replace=digitsum(num);
            min=Math.min(min,replace);
        }
        return min;
    }
        public int digitsum(int num){
            int sum=0;
            while(num>0){
                sum =sum+num%10;
                num=num/10;
            }
            return sum;
        }
}