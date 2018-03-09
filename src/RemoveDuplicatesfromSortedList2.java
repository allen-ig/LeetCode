public class RemoveDuplicatesfromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next != null && head.val == head.next.val){
            while (head.next != null && head.val == head.next.val){
                head = head.next;
            }
            return deleteDuplicates(head.next);
        }else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head){
        ListNode temp = new ListNode(-1);
        ListNode after = head;
        ListNode before = temp;
        before.next = after;
        while (after != null){
            while (after.next != null && after.next.val == after.val){
                after = after.next;
            }
            if (before.next != after){
                before.next = after.next;
                after = before.next;
            }else{
                after = after.next;
                before = before.next;
            }
        }
        return temp.next;
    }
}
