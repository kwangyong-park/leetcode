class Solution {
    public int countBinarySubstrings(String s) {
        char current = s.charAt(0);
        int count = 1;
        int preMax = 0;
        int ans = 0;
        for(int i = 1; i < s.length(); i++) {
            if(current == s.charAt(i)) {
                count++;
            } else {
                current = s.charAt(i);
                ans += Math.min(preMax, count);
                preMax = count;
                count = 1;
            }
        }
        ans += Math.min(preMax, count);
        return ans;
    }
}
