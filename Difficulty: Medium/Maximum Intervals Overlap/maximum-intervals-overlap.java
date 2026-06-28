class Solution {
    public int[] findMaxGuests(int[] Entry, int Exit[], int N) {
        // add code here.
        int n = Entry.length;
        int[][] events = new int[2*n][2];
        
        for (int i = 0; i < n; i++) {
            events[i][0] = Entry[i];
            events[i][1] = 1;
            events[i+n][0] = Exit[i];
            events[i+n][1] = -1;
        }
        
        Arrays.sort(events, (a,b) -> (a[0] != b[0]) ? a[0] - b[0] : b[1] - a[1]);
        
        int maxGuests = 0;
        int time = 0;
        int curr = 0;
        for (int[] e: events) {
            curr += e[1];
            if (curr > maxGuests) {
                maxGuests = curr;
                time = e[0];
            }
        }
    
        return new int[]{maxGuests, time};
    }
}