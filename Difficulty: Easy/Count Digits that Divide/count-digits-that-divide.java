// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int org = n;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > 0 && org % digit == 0)
                count++;
            n /= 10;
        }

        return count;
    }
}