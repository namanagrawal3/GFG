class Solution {
    static String decToBinary(int n) {
        // code here
        StringBuilder ans = new StringBuilder();
        
        while (n > 0) {
            int rem = n % 2;
            ans.append(rem);
            n /= 2;
        }
        
        return ans.reverse().toString();
    }
}