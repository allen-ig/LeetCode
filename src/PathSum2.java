import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, sum, path, res);
        return res;
    }

    private void dfs(TreeNode root, int sum, List<Integer> path, List<List<Integer>> res){
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == sum){
            res.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }else{
            dfs(root.left, sum - root.val, path, res);
            dfs(root.right, sum - root.val, path, res);
        }
        path.remove(path.size() - 1);
    }
}
