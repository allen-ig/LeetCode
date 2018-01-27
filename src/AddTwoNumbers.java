public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) l1 = new ListNode(0);
        if (l2 == null) l2 = new ListNode(0);
        int sum = l1.val + l2.val;
        ListNode newOne = new ListNode(sum % 10);
        if (sum >= 10){
            if (l2.next == null){
                l2.next = new ListNode(1);
            }else {
                l2.next.val += 1;
            }
        }
        newOne.next = addTwoNumbers(l1.next, l2.next);
        return newOne;
    }
}
