import java.util.*;

public class BinaryTreeInorderTraversal {

    /**
     * TreeNode class for binary tree.
     */

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * iterative solution
     * using stack to simulate the process of recursion
     * @param root is the root of a binary tree.
     * @return
     */

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) return new LinkedList<>();
            Stack<TreeNode> working = new Stack<>();
            List<Integer> res = new LinkedList<>();
            TreeNode cur = root;
            while (!working.isEmpty() || cur != null){
                while (cur != null){                    //travel to each node's left child until there is no left one
                    working.push(cur);
                    cur = cur.left;
                }
                cur = working.pop();
                res.add(cur.val);
                cur = cur.right;
            }
            return res;
        }

    /**
     * recursive solution with helper method to add node into res recursively.
     * @param root is the root of a binary tree.
     * @return res which restore val of each node.
     */

    public List<Integer> inorderTraversal2(TreeNode root){
        if (root == null) return new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res){
        if (root.left != null) helper(root.left, res);
        res.add(root.val);
        if (root.right != null) helper(root.right, res);
    }
}
