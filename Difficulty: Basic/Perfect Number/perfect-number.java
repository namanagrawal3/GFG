// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // code here
        int num = N;
        int sum = 0;
        while (N > 0) {
            int digit = N % 10;
            sum += factorial(digit);
            N /= 10;
        }
        
        return (sum == num) ? 1: 0;
    }
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}