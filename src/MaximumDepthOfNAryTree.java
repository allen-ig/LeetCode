import java.util.*;

public class MaximumDepthOfNAryTree {
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

    private int max = 0;
    public int maxDepth(Node root) {
        if (root == null) return 0;
        depth(root, 1);
        return max;
    }

    private void depth(Node node, int depth){
        if (node == null) return;
        max = Math.max(depth, max);
        for (Node child : node.children) depth(child, depth + 1);
    }
}
