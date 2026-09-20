class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++){
            int ans=Math.abs((97-s.charAt(i-1))+26);
            sum=sum+(ans*i);
        }
        return sum;
    }
}