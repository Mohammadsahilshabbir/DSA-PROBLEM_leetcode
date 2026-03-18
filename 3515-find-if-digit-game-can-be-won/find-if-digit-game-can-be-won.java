class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0;
        int sumDouble = 0; 
        int sumTotal = 0;

        for (int num : nums) {
            sumTotal += num;
            if (num < 10) {
                sumSingle += num;
            } else if (num < 100) {
                sumDouble += num;
            }
        }


        if (sumSingle > sumTotal - sumSingle) return true;
        if (sumDouble > sumTotal - sumDouble) return true;

        return false;
    }
}