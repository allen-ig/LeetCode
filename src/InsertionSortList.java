public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode res = new ListNode(head.val);
        while (head.next != null){
            head = head.next;
            res = insert(res, head);
        }
        return res;
    }

    private ListNode insert(ListNode res, ListNode target){
        if (res.val > target.val){
            ListNode first = new ListNode(target.val);
            first.next = res;
            return first;
        }
        ListNode pre = res;
        while (pre.next != null && pre.next.val < target.val){
            pre = pre.next;
        }
        ListNode temp = pre.next;
        pre.next = new ListNode(target.val);
        pre.next.next = temp;
        return res;
    }
}
