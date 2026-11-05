class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
      return countAtMost(nums, k) - countAtMost(nums, k - 1);


    }

    public static int countAtMost(int[] nums, int k) {
        int ct = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ls = 0;
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[ls],map.get(nums[ls])-1);
                if(map.get(nums[ls]) == 0){
                    map.remove(nums[ls]);
                }
                ls++;
            }
            ct = ct + i - ls + 1;
        }
        return ct;
    }
}