class Solution {
    public int substrCount(String s, int k) {
        // code here
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int cnt = (map.size() == k-1) ? 1: 0;
        int si = 0;
        for (int ei = k; ei < n; ei++) {
            char ch = s.charAt(ei);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            char sch = s.charAt(si);
            map.put(sch, map.get(sch) - 1);
            if (map.get(sch) == 0)
                map.remove(sch);
            si++;
            
            if (map.size() == k-1)
                cnt++;
        }
        
        return cnt;
    }
}