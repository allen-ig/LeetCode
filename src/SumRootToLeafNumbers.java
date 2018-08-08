public class SumRootToLeafNumbers {
    /**
     * time: O(n)
     * space: O(1)
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int res){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return res * 10 + root.val;
        return dfs(root.left, res * 10 + root.val) + dfs(root.right, res * 10 + root.val);
    }
}
