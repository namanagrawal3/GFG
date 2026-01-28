// User function Template for Java

class Solve {

    Vector<Integer> findRange(String str, int n) {
        // substring having max(n(0) - n(1)) will be ans
        // Try to solve by bruteforce first (you will add 'diff' to n(1) always)
        // thus, to maximize we should maximize the 'diff'
        int ml = -1, mr = -1, maxSum = Integer.MIN_VALUE;
        int l = 0, r = 0, curr = 0;
        
        for (int i = 0; i < n; i++) {
            curr += (str.charAt(i) == '0' ? 1 : -1);
            if (curr > maxSum) {
                maxSum = curr;
                r = i;
                ml = l;
                mr = r;
            }
            
            if (curr < 0) {
                curr = 0;
                l = i+1;
                r = i+1;
            }
        }
        
        Vector<Integer> v = new Vector<>();
        if (maxSum == -1) {
            v.add(-1);
        }
        else {
            v.add(ml+1);
            v.add(mr+1);
        }
        
        return v;
        
    }
}