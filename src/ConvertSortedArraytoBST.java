public class ConvertSortedArraytoBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int from, int to){
        if (from > to) return null;
        int index = from + (to - from) / 2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = helper(nums, from, index - 1);
        root.right = helper(nums, index + 1, to);
        return root;
    }
}
