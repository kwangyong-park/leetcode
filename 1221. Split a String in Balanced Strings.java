class Solution {
    public int balancedStringSplit(String S) {
        char[] s = S.toCharArray();
        if(s.length == 0) return 0;
        
        int sum = charToInt(s[0]);
        int ans = 0;
        for(int i = 1; i < s.length; i ++) {
            sum+=charToInt(s[i]);
            if(sum == 0){
                ans++;
            }
        }
        return ans;
        
    }
    
    private int charToInt(char c) {
        if(c == 'L') {
            return -1;
        } else {
            return 1;
        }
    }
}
