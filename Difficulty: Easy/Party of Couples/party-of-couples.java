// User function Template for Java

class Solution {
    static int findSingle(int[] arr) {
        // code here
        int xor = 0;
        for (int a: arr) {
            xor = xor ^ a;
        }
        
        return xor;
    }
}