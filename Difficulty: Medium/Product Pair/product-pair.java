// User function Template for Java

class Solution {
    boolean isProduct(int[] arr, long x) {
        // code here
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && x == 0)
                return true;
            
            if (x % arr[i] == 0) {
                int req = (int)(x/arr[i]);
                if (set.contains(req))
                    return true;
            }
            set.add(arr[i]);
        }
        
        return false;
    }
}