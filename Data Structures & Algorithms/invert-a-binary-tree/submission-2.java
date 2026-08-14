class Solution {
    public TreeNode invertTree(TreeNode root) {
      if(root == null) {
        return null;
      }

      TreeNode leftTre = invertTree(root.left);
      TreeNode rightTre = invertTree(root.right);

      root.right = leftTre;
      root.left = rightTre;

      return root;
    }
}


