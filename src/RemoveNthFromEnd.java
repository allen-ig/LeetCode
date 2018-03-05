public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode front = head;
        ListNode back = head;
        while (n > 1){
            back = back.next;
            n--;
        }
        if (back.next == null) return head.next;
        while (back.next.next != null){
            front = front.next;
            back = back.next;
        }
        front.next = front.next.next;
        return head;
    }
}
