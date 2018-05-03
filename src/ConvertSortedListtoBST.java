public class ConvertSortedListtoBST {
    public TreeNode sortedListToBST(ListNode head){
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        if (temp != null) temp.next = null;
        else head = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
