class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
    long sum=0;
    long x=0;
        for (int i = 0; i < s.length(); i++) {
           int digit = s.charAt(i)-'0';
        if(digit !=0 ){
            sum+=digit;
            x=x*10+digit;
            }
        }
        return x*sum;
    }
}