/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    private int height;
    
    boolean isPerfect(Node root) {
        // code here
        height = -1;
        return dfsFun(root, 0);
    }
    public boolean dfsFun(Node node, int level) {
        if (node.left == null && node.right == null) {
            if (height == -1) {
                height = level;
                return true;
            }
            else
                return height == level;
        }
        else if (node.left != null && node.right != null)
            return dfsFun(node.left, level+1) && dfsFun(node.right, level+1);
    
        else 
            return false;
    }
};