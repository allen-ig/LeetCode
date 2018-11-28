public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (left == right) return (int) Math.pow(2, left) + countNodes(root.right);
        else return (int) Math.pow(2, right) + countNodes(root.left);
    }

    private int getDepth(TreeNode root){
        if (root == null) return 0;
        return getDepth(root.left) + 1;
    }
}
