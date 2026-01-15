// User function Template for Java
class Solution {
    public List<Integer> findPair(int arr[], int target) {
        // Your code here
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            int req = target - a;
            if (set.contains(req)) {
                l.add(a);
                l.add(req);
                break;
            }
          
            set.add(a);
        }
      
        return l;
    }
}