import java.util.HashMap;

public class SmallestSubtreeWithAllTheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return root;
        HashMap<TreeNode, Integer> map = new HashMap<>();
        return helper(root, map, 1);
    }

    private TreeNode helper(TreeNode root, HashMap<TreeNode, Integer> map, int depth){
        if (root.left == null && root.right == null) {
            map.put(root, depth);
            return root;
        }
        if (root.left == null) {
            return helper(root.right, map, depth + 1);
        }
        if (root.right == null) {
            return helper(root.left, map, depth + 1);
        }
        TreeNode leftResult = helper(root.left, map, depth + 1);
        TreeNode rightResult = helper(root.right, map, depth + 1);
        if (map.get(leftResult) == map.get(rightResult)) {
            map.put(root, map.get(leftResult));
            return root;
        }
        return map.get(leftResult) > map.get(rightResult) ? leftResult : rightResult;
    }
}
