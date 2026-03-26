// User function Template for Java
class Solution {
    static int onesComplement(int N) {
        // code here
        int mul = 1;
        int ans = 0;
        
        while (N > 0) {
            int rem = N % 2;
            N /= 2;
            ans += mul * (1-rem);
            mul *= 2;
        }
        
        return ans;
    }
}