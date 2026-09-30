class Solution {
    public int longestMountain(int[] arr) {
         int n = arr.length;

        int[] inc = new int[n];
        int[] dec = new int[n];

        Arrays.fill(inc, 1);
        Arrays.fill(dec, 1);

        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) {
                inc[i] = inc[i-1] + 1;
            }
        }

        for(int i = n-2; i >= 0; i--) {
            if(arr[i] > arr[i+1]) {
                dec[i] = dec[i+1] + 1;
            }
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {
            if(inc[i] > 1 && dec[i] > 1) {
                ans = Math.max(ans, inc[i] + dec[i] - 1);
            }
        }

        return ans;
    }
}