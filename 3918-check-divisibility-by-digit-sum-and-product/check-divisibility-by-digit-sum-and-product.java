class Solution {
    public boolean checkDivisibility(int n) {
        int ans=sum(n)+prod(n);
        return n % ans == 0;

    }
    public static int sum(int n){
        if(n==0) return 0;
        return (n%10)+sum(n/10);
    }
    public static int prod(int n){
        if(n==0) return 1;
        return (n%10)*prod(n/10);
    }
}