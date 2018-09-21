import java.util.*;

public class AverageOfLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            double sum = 0.0;
            for (int i = 0; i < size; i++){
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
            }
            res.add(sum / size);
        }
        return res;
    }
}
