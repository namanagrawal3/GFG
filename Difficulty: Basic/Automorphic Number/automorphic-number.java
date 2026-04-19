class Solution {
    public String isAutomorphic(int n) {
        // code here
        int square = n * n;
        int total_digits = countDigit(n);
        int last = square % (int) Math.pow(10, total_digits);

        return (n == last) ? "Automorphic": "Not Automorphic";
    }
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}