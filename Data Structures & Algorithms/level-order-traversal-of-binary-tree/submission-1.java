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
                TreeNode currNode = queue.poll();

                list.add(currNode.val);

                if(currNode.left != null) {
                    queue.add(currNode.left);
                }

                if(currNode.right != null) {
                    queue.add(currNode.right);
                }
            }

            bfs.add(list);
        }

        return bfs;
    }
}
