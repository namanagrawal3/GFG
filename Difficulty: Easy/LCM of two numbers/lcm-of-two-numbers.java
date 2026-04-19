class Solution {
    public int lcm(int a, int b) {
        // code here
        int hcf = gcd(a,b);
        return a*b/hcf;
    }
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