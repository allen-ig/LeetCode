import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    /**
     *time: O(n)
     *space: O(n)
     */

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0) return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(map, inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode helper(HashMap<Integer, Integer> map, int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if (postEnd < postStart || inEnd < inStart) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootIndex = map.get(postorder[postEnd]);
        TreeNode left = helper(map, inorder, inStart, rootIndex - 1, postorder, postStart, postStart + rootIndex - inStart - 1);
        TreeNode right = helper(map, inorder, rootIndex + 1, inEnd, postorder, postStart + rootIndex - inStart, postEnd - 1);
        root.left = left;
        root.right = right;
        return root;
    }
}
