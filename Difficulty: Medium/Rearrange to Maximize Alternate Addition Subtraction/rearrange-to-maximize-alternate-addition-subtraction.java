class Solution {
    public List<Integer> rearrange(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        List<Integer> l = new ArrayList<>();
        
        int left = 0;
        int right = n-1;
        while (left < right) {
            l.add(arr[right--]);
            l.add(arr[left++]);
        }
        
        if (n % 2 == 1)
            l.add(arr[left]);
        
        return l;
    }
}