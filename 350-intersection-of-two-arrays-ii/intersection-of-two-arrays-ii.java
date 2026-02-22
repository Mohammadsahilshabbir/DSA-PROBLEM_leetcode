class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) list2.add(num);

        for (int num : nums1) {
            if (list2.contains(num)) {
                result.add(num);
                list2.remove((Integer) num); 
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) ans[i] = result.get(i);
        return ans;
    }
}