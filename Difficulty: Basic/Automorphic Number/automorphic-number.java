class Solution {
    public String isAutomorphic(int n) {
        // code here
        int square = n * n;
        int digits = countDigit(n);
        
        return (n == square % (int) Math.pow(10, digits)) ? "Automorphic" : "Not Automorphic";
    }
    public static int countDigit(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n /= 10;
        }
        return cnt;
    }
}