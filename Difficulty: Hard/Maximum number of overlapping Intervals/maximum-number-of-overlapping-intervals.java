
class Solution {
    public static int overlapInt(int[][] arr) {
    // Simply, Range (Interval) based problem, use the 'Line sweep' technique
        
        int n = arr.length;
        int[][] events = new int[2*n][2];
        
        for (int i = 0; i < n; i++) {
            events[i][0] = arr[i][0];
            events[i][1] = 1;
            events[i+n][0] = arr[i][1];
            events[i+n][1] = -1;
        }
        
        Arrays.sort(events, (a,b) -> (a[0] != b[0]) ? a[0] - b[0] : b[1] - a[1]);
        
        int maxOverlap = 0;
        int curr = 0;
        for (int[] e: events) {
            curr += e[1];
            maxOverlap = Math.max(maxOverlap, curr);
        }
    
        return maxOverlap;
    }
}
