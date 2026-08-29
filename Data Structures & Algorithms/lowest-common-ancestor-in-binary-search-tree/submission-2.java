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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }

        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        dfs(root, p, list1);
        dfs(root, q, list2);

        TreeNode sameLCA = null;
        int minLen = Math.min(list1.size(), list2.size());

        for(int i=0; i<minLen; i++) {
            if(list1.get(i) == list2.get(i)) {
                sameLCA = list1.get(i);
            } else {
                break;
            }
        }

        return sameLCA;
    }

    public boolean dfs(TreeNode root, TreeNode p, List<TreeNode> list) {
        if(root == null) {
            return false;
        }

        list.add(root);

        if(root == p) {
            return true;
        }

        boolean leftTree = dfs(root.left, p, list);
        boolean rightTree = dfs(root.right, p, list);
        
        if(leftTree || rightTree) {
            return true;
        }

        list.remove(list.size()-1);
        return false; //final false
    }

    /* public TreeNode findLCA(TreeNode root, int same) {
        if(root == null) {
            return null;
        }

        if(root.val == same) {
            return root;
        }

        TreeNode leftTree = findLCA(root.left, same);
        if(leftTree != null) {
            if(leftTree.val == same) {
                return leftTree;
            }
        }
        TreeNode rightTree = findLCA(root.right, same);
        if(rightTree != null) {
            if(rightTree.val == same) {
                return rightTree;
            }
        }

        return root;
    } */
}
