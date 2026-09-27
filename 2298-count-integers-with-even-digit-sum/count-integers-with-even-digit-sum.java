class Solution {
    public int countEven(int num) {
       int count = 0;

        for (int i = 1; i <= num; i++) {
            if (helper(i) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
    public int helper(int num){
        if(num==0) return 0;
        return (num%10)+helper(num/10);
    }
}