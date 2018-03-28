public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (curr.next != null){
            curr = curr.next;
            count++;
        }
        k %= count;
        curr.next = head;
        while (count != k){
            curr = curr.next;
        }
        ListNode res = curr.next;
        curr.next = null;
        return res;
    }
}
