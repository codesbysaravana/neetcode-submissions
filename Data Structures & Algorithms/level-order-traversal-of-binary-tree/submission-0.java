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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> bfs = new ArrayList<>();
        if(root == null) {
            return bfs;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<levelSize; i++) {
                TreeNode node = queue.poll();

                TreeNode leftTree = node.left;
                TreeNode rightTree = node.right;
                list.add(node.val);
                //only add children if they exist
                if(leftTree != null) {
                    queue.add(leftTree);
                } 
                if(rightTree != null) {
                    queue.add(rightTree);
                } 
            }

            bfs.add(list);
        }

        return bfs;
    }
}
