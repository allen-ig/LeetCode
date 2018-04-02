import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceinBST {
    Integer res = Integer.MAX_VALUE, pre = null;
    public int getMinimumDifference(TreeNode root) {
        if (root.left != null) getMinimumDifference(root.left);
        if (pre != null) res = Math.min(res, root.val - pre);
        pre = root.val;
        if (root.right != null) getMinimumDifference(root.right);
        return res;
    }

    public int getMinimumDifference2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                int temp = list.get(j) - list.get(i);
                res = Math.min(res, temp);
            }
        }
        return res;
    }

    private void inorder(TreeNode node, List<Integer> list){
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
