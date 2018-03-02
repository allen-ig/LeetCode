public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Object min, Object max){
        if (node == null) return true;
        if (min != null && node.val <= (Integer) min) return false;
        if (max != null && node.val >= (Integer) max) return false;
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}
