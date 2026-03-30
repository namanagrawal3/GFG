// User function Template for Java

class Solution {
    public long find_fact(int n) {
        // Code here
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}