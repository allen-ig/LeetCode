
import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> temp = new LinkedList<>();
        if (root == null) return res;
        temp.add(root);
        while (!temp.isEmpty()){
            int levelNum = temp.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < levelNum; i++){
                if (temp.peek().left != null) temp.add(temp.peek().left);
                if (temp.peek().right != null) temp.add(temp.peek().right);
                sub.add(temp.poll().val);
            }
            res.add(sub);
        }
        return res;
    }
}
