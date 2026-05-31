class Solution {
    public int[] findSubarray(int[] nums) {
        // Code here
        int n = nums.length;
        
        // First, find the possible unsorted part (find position from start & end)
        int si = -1;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] > nums[i+1]) {
                si = i;
                break;
            }
        }

        if (si == -1)           // 'nums' is already sorted
            return new int[] {0, 0};

        int ei = -1;
        for (int i = n-1; i > 0; i--) {
            if (nums[i] < nums[i-1]) {
                ei = i;
                break;
            }
        }

        // [si, ei] is the possible unsorted subarray (check it by finding max & min)
        int min = nums[si];
        int max = nums[si];
        for (int i = si+1; i <= ei; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }

        for (int i = 0; i < si; i++) {
            if (nums[i] > min) {
                si = i;
                break;
            }
        }

        for (int i = n-1; i > ei; i--) {
            if (nums[i] < max) {
                ei = i;
                break;
            }
        }

        return new int[] {si, ei};
    }
}