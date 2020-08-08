class Solution {
 public boolean detectCapitalUse(String word) {

        char[] c = word.toCharArray();
        int isLow = 0;
        int isUp = 0;
        for(int i = 0 ; i < word.length(); i++) {
            if(Character.isLowerCase(c[i])) {
                isLow++;
            } else {
                isUp++;
            }
        }
        if(isLow == word.length()) {
            return true;
        } else if(isUp == word.length()) {
            return true;
        } else if(isUp == 1 && Character.isUpperCase(c[0])) {
            return true;
        }
        return false;
    }
}
