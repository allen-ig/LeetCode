public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return root != null && (root.left == null && root.right == null && sum - root.val == 0
                || hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
    }
}
