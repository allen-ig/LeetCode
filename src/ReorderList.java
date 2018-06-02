public class ReorderList {
    public void reorderList(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode preMid = slow;
        ListNode preCur = slow.next;
        while (preCur.next != null){
            ListNode cur = preCur.next;
            preCur.next = cur.next;
            cur.next = preMid.next;
            preMid.next = cur;
        }

        slow = head;
        fast = preMid.next;
        while (slow != preMid){
            preMid.next = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = fast.next;
            fast = preMid.next;
        }
    }
}
