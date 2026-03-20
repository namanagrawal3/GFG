public class Solution {
    public static void toBinary(int n) {
        // code here
        int ans = 0;
        int mul = 1;
        
        while (n > 0) {
            int rem = n % 2;
            ans += rem * mul;
            mul *= 10;
            n /= 2;
        }
        
        System.out.print(ans);
    }
}
