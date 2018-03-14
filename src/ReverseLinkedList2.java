public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i < m - 1; i++){
            pre = pre.next;
        }
        ListNode curr = pre.next;
        ListNode follow = curr.next;
        for (int j = 0; j < n - m; j++){
            curr.next = follow.next;
            follow.next = pre.next;
            pre.next = follow;
            follow = curr.next;
        }
        return dummy.next;
    }
}