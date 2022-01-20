class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char c : s.toCharArray())
            count[c]++;
        int ans = 0;
        for(int i = 0; i < 128; i++) {
            int v = count[i];
            ans += v / 2 * 2;
            if(ans % 2 == 0 && v % 2 == 1)  {
                ans ++;
            }
        }
        return ans;
    }
}
