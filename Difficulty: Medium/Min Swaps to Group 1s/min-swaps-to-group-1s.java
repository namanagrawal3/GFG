// User function Template for Java

class Solution {
    public int minSwaps(int[] arr) {
        // Complete the function
        int n = arr.length;
        int c1 = 0;
        
        for (int a: arr) {
            if (a == 1)
                c1++;
        }
        
        if (c1 == 0)
            return -1;
        
        int k = c1;
        c1 = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] == 1)
                c1++;
        }
        
        int max1 = c1;
        int si = 0;
        for (int ei = k; ei < n; ei++) {
            if (arr[ei] == 1)
                c1++;
            if (arr[si] == 1)
                c1--;
            si++;
            max1 = Math.max(max1, c1);
        }
        
        return k-max1;
    }
}
