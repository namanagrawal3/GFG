class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);           // sorts in Ascending order
        return arr[n-1];
    }
}
