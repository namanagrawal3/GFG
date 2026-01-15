class Solution {
    int countPairs(int arr[], int target) {
        // code here
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int req = target - arr[i];
            if (map.containsKey(req))
                cnt += map.get(req);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return cnt;
    }
}