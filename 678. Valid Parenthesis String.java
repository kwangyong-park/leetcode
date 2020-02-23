
class Solution {

    public boolean checkValidString(String s) {
      int lo = 0;
      int hi = 0;
      char[] c = s.toCharArray();
      for(int i = 0 ; i < c.length; i++) {
        if(c[i] == '(') {
          lo ++;
          hi ++;
        } else if(c[i] == '*') {
          lo --;
          hi ++;
        } else {
          lo --;
          hi --;
        }
        if(hi < 0) {
          break;
        }
        lo = Math.max(lo, 0);
      }
      
      return lo == 0;      
    }
}
