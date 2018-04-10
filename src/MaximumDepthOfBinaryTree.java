public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int res = 1;
        res += Math.max(maxDepth(root.left), maxDepth(root.right));
        return res;
    }
}