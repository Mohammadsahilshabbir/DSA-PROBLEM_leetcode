class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b)->{
            if (a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int[] dp = new int[envelopes.length];
        int ans=0;
        for (int[] envelope:envelopes) {
            int h=envelope[1];
            int l=0;
            int r=ans;
              while(l<r){
                int mid=l+(r-l)/2;
                if(dp[mid]<h){
                    l=mid+1;
                }else{
                    r=mid;
                }
            }
            dp[l]=h;
            if (l==ans){
                ans++;
            }
        }
        return ans;
    }
}