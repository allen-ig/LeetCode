import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        while (l1 != null && l2 != null){
            if (l1.val >= l2.val){
                res.next =new ListNode(l2.val);
                l2 = l2.next;
            }
            else{
                res.next =new ListNode(l1.val);
                l1 = l1.next;
            }
            res = res.next;
        }
        if (l1 != null){
            res.next = l1;
        }else{
            res.next = l2;
        }
        return res;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists2(l2.next, l1);
            return l2;
        }
    }
}
