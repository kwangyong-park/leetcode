
class Solution {

    public boolean checkValidString(String s) {
        return bk(s.toCharArray(), 0, 0);
    }

    public boolean bk(char[] chars, int commited, int count) {
        for(int i = commited; i < chars.length; i++) {
            if(count < 0) {
                return false;
            }
            if (chars[i] == '(') {
                count += 1;
            } else if (chars[i] == ')') {
                count -= 1;
            } else {
                boolean result1 = bk(chars, i + 1, count - 1);
                boolean result2 = bk(chars, i + 1, count + 1);

                if (result1 || result2) {
                    return true;
                }
            }
        }
        return count == 0;
    }

}
