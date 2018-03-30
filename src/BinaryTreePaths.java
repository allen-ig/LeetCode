import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) dfs(res, root, "");
        return res;
    }

    private void dfs(List<String> res, TreeNode node, String path){
        if (node.left == null && node.right == null) res.add(path + node.val);
        if (node.left != null) dfs(res, node.left, path + node.val + "->");
        if (node.right != null) dfs(res, node.right, path + node.val + "->");
    }
}
