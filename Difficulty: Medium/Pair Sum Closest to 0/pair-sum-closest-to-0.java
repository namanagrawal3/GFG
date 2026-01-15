// User function Template for Java

class Solution {
    public static int closestToZero(int arr[], int n) {
        // your code here
        Arrays.sort(arr);
        int maxSum = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < minDiff) {
                ans = sum;
                minDiff = Math.abs(sum);
                maxSum = sum;
            }
            else if (Math.abs(sum) == minDiff && sum > maxSum) {
                ans = sum;
                minDiff = Math.abs(sum);
                maxSum = sum;
            }
            
            if (sum > 0)
                right--;
            else
                left++;
        }
        
        return ans;
    }
}