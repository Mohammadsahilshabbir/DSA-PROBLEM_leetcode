class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1=0;
        for (int num1 : nums1) {
        for (int num2 : nums2) {
            if (num1 == num2) {
                answer1++;
                break;
            }
        }
    }
    
    int answer2 = 0;
    for (int num2 : nums2) {
        for (int num1 : nums1) {
            if (num2 == num1) {
                answer2++;
                break;
            }
        }
    }
    
    return new int[]{answer1, answer2};

    }
}