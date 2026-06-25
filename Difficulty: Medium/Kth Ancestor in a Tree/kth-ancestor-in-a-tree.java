/* Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    private HashMap<Integer, Integer> parent;
    public int kthAncestor(Node root, int k, int node) {
    // Since, we have to find the ancestor only 1 time so directly finding it
        parent = new HashMap<>();
        dfsFun(root, null);
        
        int ancestor = node;
        while (k-- > 0) {
            ancestor = parent.get(ancestor);
            if (ancestor == -1)
                break;
        }
        
        return ancestor;
    }
    public void dfsFun(Node node, Node prev) {
        if (node == null)
            return;
        
        parent.put(node.data, (prev == null ? -1 : prev.data));
        
        if (node.left != null)
            dfsFun(node.left, node);
        if (node.right != null)
            dfsFun(node.right, node);
    }
}