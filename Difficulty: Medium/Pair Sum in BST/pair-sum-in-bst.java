/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        return preOrd(root, target, set);
    }
    public boolean preOrd(Node node, int x, HashSet<Integer> set) {
        if (node == null)
            return false;
        
        int req = x - node.data;
        if (set.contains(req))
            return true;
        set.add(node.data);
        
        return preOrd(node.left, x, set) || preOrd(node.right, x, set);
    } 
}