class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        l.add(-1);
        l.add(-1);
        
        int left = 0, right = arr.length-1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                l.set(0, left+1);
                l.set(1, right+1);
                return l;
            }
            else if (sum < target)
                left++;
            else
                right--;
        }
        
        return l;
    }
}