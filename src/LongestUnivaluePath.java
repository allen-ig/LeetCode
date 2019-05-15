public class LongestUnivaluePath {
    int res;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        res = 0;
        helper(root, root.val);
        return res;
    }

    private int helper(TreeNode node, int pred){
        if (node == null) return 0;
        int left = helper(node.left, node.val);
        int right = helper(node.right, node.val);
        res = Math.max(res, left + right);
        return pred == node.val ? Math.max(left, right) + 1 : 0;
    }
}
