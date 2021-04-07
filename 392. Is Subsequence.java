class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        int length = s.length();
        if(length == 0) return true;
        for(int i = 0; i < t.length(); i++) {
            if(index == length) return true;
            if(t.charAt(i) == s.charAt(index)) {
                index++;
            }
        }
        return index == length;
    }
}
