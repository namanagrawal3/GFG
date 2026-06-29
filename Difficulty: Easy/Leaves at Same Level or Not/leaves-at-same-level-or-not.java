/* Definition for Node
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
    private int height;
    
    public boolean check(Node root) {
        // code here
        height = -1;
        return dfsFun(root, 0);
    }
    public boolean dfsFun(Node node, int level) {
        if (node == null)
            return true;
            
        if (node.left == null && node.right == null) {
            if (height == -1) {
                height = level;
                return true;
            }
            else 
                return level == height;
        }
        
        return dfsFun(node.left, level+1) && dfsFun(node.right, level+1);
    }
}