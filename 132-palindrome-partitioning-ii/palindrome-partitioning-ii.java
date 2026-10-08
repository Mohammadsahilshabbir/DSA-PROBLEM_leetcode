class Solution {
    public int minCut(String s) {
        int n=s.length();
        Integer[] dp=new Integer[n];

        return helper(0, s, dp);
    }

    public int helper(int start, String s, Integer[] dp) {
        if (start==s.length()) return -1;

        if (dp[start] != null) return dp[start];

        int ans=Integer.MAX_VALUE;

        for (int end=start; end<s.length(); end++) {

            if (isPalindrome(s.substring(start, end+1), s)) {
                ans = Math.min(ans, 1 + helper(end+1, s, dp));
            }
        }

        return dp[start] = ans;
    }

    public static boolean isPalindrome(String str, String s) {
        int i=0;
        int j=str.length()-1;
        while (i<j) {

            if (str.charAt(i)!=str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}