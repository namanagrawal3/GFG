class Solution {
    public int binary_to_decimal(int n) {
        // Code here
        int b = 2;

        int ans = 0;
        int pow = 1;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + (rem * pow);
            pow = pow * b;
        }

        return ans;
    }
}
