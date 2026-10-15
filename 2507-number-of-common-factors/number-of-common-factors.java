class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int ans=a;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        return count;
    }
}