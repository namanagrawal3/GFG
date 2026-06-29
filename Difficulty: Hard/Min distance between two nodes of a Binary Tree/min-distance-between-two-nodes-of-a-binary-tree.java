/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    private HashMap<Integer, Integer> dist;
    
    public int findDist(Node root, int a, int b) {
    // dist(a, b) = dist(a, root) + dist(b, root) - 2*dist(LCA(a,b), root)
        dist = new HashMap<>();
        dfsFun(root, 0);  
        
        int lca = LCAFun(root, a, b).data;
        return dist.get(a) + dist.get(b) - 2*dist.get(lca);
    }
    public void dfsFun(Node node, int level) {
        if (node == null)
            return;
        
        dist.put(node.data, level);
        
        dfsFun(node.left, level+1);
        dfsFun(node.right, level+1);
    }
    public Node LCAFun(Node node, int n1, int n2) {
        if (node == null)
		    return null;
		    
		if (node.data == n1 || node.data == n2)
		    return node;
		    
		Node left = LCAFun(node.left, n1, n2);
		Node right = LCAFun(node.right, n1, n2);
		
		if (left == null)
		    return right;
		else if(right == null)
		    return left;
		else
		    return node;
    }
}