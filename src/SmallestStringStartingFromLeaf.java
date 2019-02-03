public class SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        if (root == null) return "~";
        char c = (char) (root.val + 'a');
        if (root.left == null && root.right == null) { return "" + c; }
        String left = smallestFromLeaf(root.left);
        String right = smallestFromLeaf(root.right);
        return (left.compareTo(right) < 0 ? left : right) + c;
    }
}
