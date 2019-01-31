public class SortList {
    /**
     * time: O(logn)
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;

        ListNode first = sortList(head);
        ListNode second = sortList(slow);

        return merge(first, second);
    }

    private ListNode merge(ListNode first, ListNode second){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (first != null && second != null){
            if (first.val < second.val){
                curr.next = first;
                first = first.next;
            }else{
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }
        if (first != null) curr.next = first;
        if (second != null) curr.next = second;
        return dummy.next;
    }
}
