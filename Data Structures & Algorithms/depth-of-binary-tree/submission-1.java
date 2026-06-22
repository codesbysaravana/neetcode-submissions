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

/* class Solution {
    public int maxDepth(TreeNode root) {
        int simple = 0;
        int left = 0; int right = 0;;
        if(root == null) {
            return 0;
        }

        int leftCounted = leftTree(root);
        System.out.println(leftCounted);
        int rightCounted = rightTree(root);
        System.out.println(rightCounted);

        return leftCounted + rightCounted -1;
    }

     public int leftTree(TreeNode node) {
        int count = 0;
        if(node == null) {
            return 0;
        }

        count = 1 + leftTree(node.left);

        return count;
    } 
     public int rightTree(TreeNode node) {
        int count = 0;
        if(node == null) {
            return 0;
        }

        count = 1 + rightTree(node.right);

        return count;
    } 
} */


class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    } 
}

//EASY WAY
/* 1. Find depth of left subtree
2. Find depth of right subtree
3. Pick the bigger one
4. Add myself (+1) */