class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);

        int max = arr[n-1];
        int secMax = -1;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] != max) {
                secMax = arr[i];
                break;
            }
        }

        return secMax;
    }
}