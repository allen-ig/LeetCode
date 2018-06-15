import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees2 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return helper(1, n);
    }

    public List<TreeNode> helper(int start, int end){
        List<TreeNode> res = new ArrayList<>();

        if (start > end) {
            res.add(null);
            return res;
        }

        if (start == end) {
            res.add(new TreeNode(start));
            return res;
        }

        List<TreeNode> left, right;
        for (int i = start; i <= end; i++){
            left = helper(start, i - 1);
            right = helper(i + 1, end);

            for (TreeNode leftnode : left){
                for (TreeNode rightnode : right){
                    TreeNode root = new TreeNode(i);
                    root.left = leftnode;
                    root.right = rightnode;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
