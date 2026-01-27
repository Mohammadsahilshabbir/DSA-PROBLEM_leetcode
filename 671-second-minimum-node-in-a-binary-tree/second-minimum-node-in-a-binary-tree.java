/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
     if (root == null) return -1;

        int min = root.val;
        dfs(root, min);
        return secondMin;
    }

    int secondMin = -1;
    void dfs(TreeNode node, int min) {
        if (node == null) return;

        if (node.val > min) {
            if (secondMin == -1 || node.val < secondMin) {
                secondMin = node.val;
            }
        }

        dfs(node.left, min);
        dfs(node.right, min);   
    }
}