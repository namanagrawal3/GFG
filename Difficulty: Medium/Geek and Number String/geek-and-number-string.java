// User function Template for Java

class Solution {
    public int minLength(String s, int n) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - '0';
            
            if (st.isEmpty())
                st.push(ch);
            else if(isValid(st.peek()+""+ch))
                st.pop();
            else
                st.push(ch);
        }
        
        return st.size();
    }
    public boolean isValid(String s) {
        String[] arr = {"12","21","34","43","56","65","78","87","09","90"};
        for (String a: arr) {
            if (a.equals(s))
                return true;
        }
        return false;
    }
}