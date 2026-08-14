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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        TreeNode rightTree = root.left;
        TreeNode leftTree = root.right;

        boolean leftIsBalanced = isBalanced(root.left);
        boolean rightIsBalanced = isBalanced(root.right);
        if(leftIsBalanced == false) {
            return false;
        }
        if(rightIsBalanced == false) {
            return false;
        }

        if(Math.abs(getHeight(rightTree) - getHeight(leftTree)) > 1) {
            return false;
        }

        return true;
    }

    private int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
