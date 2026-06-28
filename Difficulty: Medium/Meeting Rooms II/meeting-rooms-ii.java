class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // since, Range (Interval) based problem, try to use 'Line Sweep'
        int n = start.length;
        int[][] events = new int[2*n][2];
        
        int idx = 0;
        for (int i = 0; i < n; i++) {
            events[i][0] = start[i];
            events[i][1] = 1;
            events[i+n][0] = end[i];
            events[i+n][1] = -1;
        }
        
        Arrays.sort(events, (a,b) -> (a[0] != b[0]) ? a[0] - b[0] : a[1] - b[1]);
        
        int minRooms = 0;
        int curr = 0;
        for (int[] e: events) {
            curr += e[1];
            minRooms = Math.max(minRooms, curr);
        }
    
        return minRooms;
    }
}
