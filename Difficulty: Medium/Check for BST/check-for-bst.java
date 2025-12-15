/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        List<Integer> l = new ArrayList<>();
        inOrd(root, l);
        
        for (int i = 0; i < l.size()-1; i++) {
            if (l.get(i) > l.get(i+1))
                return false;
        }
        return true;
    }
    public static void inOrd(Node node, List<Integer> l) {
        if (node == null)
            return;
            
        inOrd(node.left, l);
        l.add(node.data);
        inOrd(node.right, l);
    }
}