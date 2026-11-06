class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] freq =new int[2];
        int count=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
             if(nums[i] == nums[j]) {
                    freq[count] = nums[i];
                    count++;

                    break;
                }
            }

            if(count == 2) {
                break;
            }
        }

        return freq;
    }
}