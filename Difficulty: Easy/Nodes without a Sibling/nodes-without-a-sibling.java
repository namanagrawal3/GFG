/*
Definition for Node
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
    public List<Integer> noSibling(Node root) {
        // code here
        List<Integer> l = new ArrayList<>();
        dfsFun(root, l);
        
        if (l.size() == 0)
            l.add(-1);
            
        Collections.sort(l);
        return l;
    }
    public void dfsFun(Node node, List<Integer> l) {
        if (node == null)
            return;
        
        if (node.left != null && node.right != null) {
            dfsFun(node.left, l);
            dfsFun(node.right, l);
        }
        else if (node.left != null) {
            l.add(node.left.data);
            dfsFun(node.left, l);
        }
        else if (node.right != null) {
            l.add(node.right.data);
            dfsFun(node.right, l);
        }
    }
}