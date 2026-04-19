// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int org = n;
        int total_digits = countDigits(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, total_digits);
            n /= 10;
        }

        return (sum == org) ? true: false;
    }
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}