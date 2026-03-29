// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int num = 0;
        while (n > 0) {
            int digit = n % 10;
            num = num * 10 + digit;
            n /= 10;
        }
        
        return num;
    }
}