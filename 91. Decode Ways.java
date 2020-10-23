class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int numDecodings(String s) {
        return rec(s, 0);
    }
    
    public int rec(String s, int i) {
    
        if (i == s.length()) {
            return 1;
        }
        
        if (s.charAt(i) == '0') {
            return 0;
        }

        if (i == s.length()-1) {
            return 1;
        }
        
        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        
        int ans = rec(s, i + 1);
        if(Integer.parseInt(s.substring(i, i + 2)) <=26)
            ans += rec(s, i + 2);
        memo.put(i, ans);

        return ans;
    }
}
