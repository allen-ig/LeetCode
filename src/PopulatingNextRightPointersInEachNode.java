public class PopulatingNextRightPointersInEachNode {
    private class TreeLinkNode{

        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public void connect(TreeLinkNode root){
        TreeLinkNode head = null;
        TreeLinkNode prev = null;
        TreeLinkNode curr = root;
        while (curr != null){
            while (curr != null){
                if (curr.left != null){
                    if (prev != null) prev.next = curr.left;
                    else head = curr.left;
                    prev = curr.left;
                }
                if (curr.right != null){
                    if (prev != null) prev.next = curr.right;
                    else head = curr.right;
                    prev = curr.right;
                }
                curr = curr.next;
            }
            curr = head;
            head = null;
            prev = null;
        }
    }
}
