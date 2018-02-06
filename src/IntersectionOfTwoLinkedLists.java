public class IntersectionOfTwoLinkedLists {

    /**
     * Go through twice
     * Time: O(m + n)
     * Space: O(1)
     * @param headA
     * @param headB
     * @return
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    /**
     * Truncate length to identical
     * Time: O(n)
     * Space: O(1)
     * @param headA
     * @param headB
     * @return
     */

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB){
        if (headA == null || headB == null) return null;
        int lenA = len(headA);
        int lenB = len(headB);
        while (lenA != lenB){
            if (lenA > lenB){
                headA = headA.next;
                lenA--;
            }else {
                headB = headB.next;
                lenB--;
            }
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int len(ListNode head){
        int length = 1;
        while (head != null){
            head = head.next;
            length++;
        }
        return length;
    }
}
