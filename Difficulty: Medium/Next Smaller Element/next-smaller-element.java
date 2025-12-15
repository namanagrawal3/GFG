class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ll = new ArrayList<>();
        int n = arr.length;
        
        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ll.add(st.isEmpty() ? -1 : arr[st.peek()]);
            st.push(i);
        }
        
        int l = 0, r = ll.size()-1;
        while (l < r) {
            int temp = ll.get(l);
            ll.set(l, ll.get(r));
            ll.set(r, temp);
            l++;
            r--;
        }
        
        return ll;
    }
}