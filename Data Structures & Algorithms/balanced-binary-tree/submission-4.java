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
        returnHeightDFS(root);
        return flag;
    }

    public int returnHeightDFS(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftTree = returnHeightDFS(node.left);
        int rightTree = returnHeightDFS(node.right);

        if(Math.abs(leftTree - rightTree) > 1) {
            flag = false;
        }

        return 1 + Math.max(leftTree, rightTree);
    }
}

//remember when does the counting in trees start?
// when the leaf node is reahced like both left and right gets null, it returns okay added by one


//remeber left = 1 + leftTreeRec(node.left); --->will only keep going in the left 
// remmber right = 1 + rightTreeRec(node.right -->) no subtrees only right
