class Solution {
  public String longestPalindrome(String s) {
      char[] chars = s.toCharArray();
      if(chars.length == 0) return s;
      if(chars.length == 1) return s;
      String result = "";
      for(int i = 0; i < chars.length; i++) {
        for(int j = i + 1; j < chars.length; j++) {
            if(chars[i]  == chars[j]) {
                String val = s.substring(i, j+1);
                if(isSame(chars, i, j) && val.length() > result.length()) {
                    result = val;
                }
            }
        }    
      }
      if(result.equals("")) {
          return s.substring(0, 1);
      }
      return result;
  }
    public boolean isSame(char[] chars, int l, int r) {
        while(l < r) {
            if(chars[l++] != chars[r--]) {
                return false;
            }
        }
        return true;
    }
}
