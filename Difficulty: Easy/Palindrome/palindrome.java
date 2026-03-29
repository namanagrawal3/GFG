class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int N = n;
        int num = 0;
        while (n > 0) {
            int digit = n % 10;
            num = num * 10 + digit;
            n /= 10;
        }
        
        return num == N;
    }
}