public class ConvertBSTtoGreaterTree {
    private int sum;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        if (sum == 0) sumAll(root);
        if (root.left != null){
            convertBST(root.left);
        }
        int temp = root.val;
        root.val = sum;
        sum -= temp;
        if (root.right != null){
            convertBST(root.right);
        }
        return root;
    }

    private void sumAll(TreeNode root){
        if (root.left != null){
            sumAll(root.left);
        }
        sum += root.val;
        if (root.right != null){
            sumAll(root.right);
        }
    }
}
