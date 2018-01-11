public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int i, ListNode n) {
        val = i;
        next = n;
    }

    public void insertAfter(int item) {
        next = new ListNode(item, next);  //insert new Node after this
    }
}
