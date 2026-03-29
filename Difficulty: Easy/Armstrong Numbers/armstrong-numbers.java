// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int num = n;
        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, 3);
            n /= 10;
        }
        return num == sum;
    }
}