import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    /**
     * space: O(n)
     * time: O(n)
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        while (root != null){
            res.add(root.val);
            if (root.right != null) stack.push(root.right);
            root = root.left;
            if (root == null && !stack.isEmpty()) root = stack.pop();
        }
        return res;
    }
}
