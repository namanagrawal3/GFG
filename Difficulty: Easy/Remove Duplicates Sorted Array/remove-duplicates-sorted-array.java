class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        int n = arr.length;
        l.add(arr[0]);
        
        for (int i = 1; i < n; i++) {
            if (arr[i] != l.get(l.size()-1))
                l.add(arr[i]);
        }
        
        return l;
    }
}
