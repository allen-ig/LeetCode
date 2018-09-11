public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        return helper(root, null);
    }

    private TreeNode helper(TreeNode root, TreeNode tail){
        if (root == null) return tail;
        TreeNode res = helper(root.left, root);
        root.left = null;
        root.right = helper(root.right, tail);
        return res;
    }
}
