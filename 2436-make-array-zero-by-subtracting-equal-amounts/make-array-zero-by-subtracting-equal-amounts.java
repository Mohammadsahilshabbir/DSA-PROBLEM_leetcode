class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> ans=new HashSet<>();
        int n=nums.length;
        
        for(int num :nums){
            if(num>0){
                ans.add(num);
            }
        }
        return ans.size();
    }
}