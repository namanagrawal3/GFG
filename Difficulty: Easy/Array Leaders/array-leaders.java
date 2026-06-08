class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        int max = -1;
        
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                l.add(arr[i]);
            }
        }
        l.sort(Collections.reverseOrder());
        return l;
    }
}
