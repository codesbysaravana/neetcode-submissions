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
    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    public int dfs(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftTree = dfs(node.left);
        int rightTree = dfs(node.right);

        if(Math.abs(leftTree - rightTree) > 1) {
            flag = false;
        } // once imbalance found, foorever false
        System.out.println(leftTree);
        System.out.println(rightTree);
        return 1 + Math.max(leftTree, rightTree);
    }
}


//remeber left = 1 + leftTreeRec(node.left); --->will only keep going in the left 
// remmber right = 1 + rightTreeRec(node.right -->) no subtrees only right
