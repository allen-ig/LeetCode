public class RemoveDuplicatesfromSortedList {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode cur = head;
            while (cur.next != null){
                if (cur.next.val == cur.val){
                    cur.next = cur.next.next;
                }
                else{
                    cur = cur.next;
                }
            }
            return head;
        }
    }
}