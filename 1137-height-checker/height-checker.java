class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] x = heights.clone();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=x[i]){
                count++;
            }
        }
        return count;
    }
}