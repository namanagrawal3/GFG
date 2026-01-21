// User function Template for Java

class Solution {
    static int countTriplets(int Arr[], int N, int L, int R) {
        // code here
        Arrays.sort(Arr);
        return cntLess(Arr, N, R) - cntLess(Arr, N, L-1);
    }
    public static int cntLess(int[] arr, int n, int sum) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int l = i+1;
            int r = n-1;
            int req = sum - arr[i];
            while (l < r) {
                long curr = arr[l] + arr[r];
                if (curr <= req) {
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