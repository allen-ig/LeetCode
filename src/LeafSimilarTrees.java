import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    List<Integer> first = new ArrayList<>();
    List<Integer> second = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1, first);
        helper(root2, second);
        return first.equals(second);
    }

    private void helper(TreeNode root, List<Integer> list){
        if (root == null) return;
        if (root.left != null || root.right != null){
            helper(root.left, list);
            helper(root.right, list);
        }else list.add(root.val);
    }
}
