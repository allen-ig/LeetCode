import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        helper(res, 0, root);
        return res;
    }

    private void helper(List<List<Integer>> res, int level, TreeNode node){
        if (node == null) return;
        if (res.size() <= level) res.add(0, new LinkedList<>());
        helper(res, level + 1, node.left);
        helper(res, level + 1, node.right);
        res.get(res.size() - level - 1).add(node.val);
    }
}
