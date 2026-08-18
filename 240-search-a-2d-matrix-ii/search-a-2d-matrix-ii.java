class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int row=matrix.length;
        int col=matrix[0].length;
        return search(matrix,target,0,col-1);
    }
    public boolean search(int[][] matrix,int target,int i,int j){
        if(i>=matrix.length || j<0) return false;
        if(matrix[i][j]==target) return true;
        if(matrix[i][j]>target) return search(matrix,target,i,j-1);
        else return search(matrix,target,i+1,j);
    }
}