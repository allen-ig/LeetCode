import java.util.ArrayList;
import java.util.List;

public class TwoSum4 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            if (list.get(i) + list.get(j) < k) i++;
            else if (list.get(i) + list.get(j) > k) j--;
            else return true;
        }
        return false;
    }

    private void inorder(TreeNode node, List<Integer> list){
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
