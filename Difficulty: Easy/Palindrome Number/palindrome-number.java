class Solution {
    public boolean isPalindrome(int n) {
        // code here
        n = Math.abs(n);
        int org = n;
        int num = 0;        // reversed num
        while (n > 0) {
            int digit = n % 10;
            num = num * 10 + digit;
            n /= 10;
        }

        return (org == num) ? true : false;
    }
}