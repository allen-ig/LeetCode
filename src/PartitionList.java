public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);
        ListNode first = dummy1, second = dummy2;
        while (head != null){
            if (head.val < x) {
                first.next = head;
                first = first.next;
            }else{
                second.next = head;
                second = second.next;
            }
            head = head.next;
        }
        second.next = null;
        first.next = dummy2.next;
        return dummy1.next;
    }
}
