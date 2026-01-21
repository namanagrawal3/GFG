// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            int l = i+1;
            int r = n-1;
            long req = sum - arr[i];
            while (l < r) {
                long curr = arr[l] + arr[r];
                if (curr < req) {
                    cnt += r-l;
                    l++;
                }
                else 
                    r--;
            }
        }
        
        return cnt;
        
    }
}
