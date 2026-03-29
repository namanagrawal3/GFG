class Solution {
    static void printFloydTriangle(int n) {
        // code here
        int val = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}