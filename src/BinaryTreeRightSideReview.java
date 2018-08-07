import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideReview {
    /**
     * time: O(n)
     * space: O(1)
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> res, int index){
        if(root == null) return;
        if (index >= res.size()) res.add(root.val);
        dfs(root.right, res, index + 1);
        dfs(root.left, res, index + 1);

    }
}
