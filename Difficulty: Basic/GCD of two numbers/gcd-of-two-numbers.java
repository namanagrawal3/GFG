class Solution {
    public static int gcd(int a, int b) {
        // code here
        int dividend = a;
        int divisor = b;
        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
        
    }
}
