import java.util.Stack;

public class BSTIterator {

    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        TreeNode temp_right = temp.right;
        while (temp_right != null){
            stack.push(temp_right);
            temp_right = temp_right.left;
        }
        return temp.val;
    }
}
