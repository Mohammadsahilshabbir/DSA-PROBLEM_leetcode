class Solution {
    public long removeZeros(long n) {
        ArrayList<Long>ans=new ArrayList<>();
        while(n>0){
            long digit=n%10;
            if(digit!=0){
                ans.add(digit);
            }
            n=n/10;
        }
        long result = 0;

        for (int i = ans.size() - 1; i >= 0; i--) {
            result = result * 10 + ans.get(i);
        }

        return result;
    }
}