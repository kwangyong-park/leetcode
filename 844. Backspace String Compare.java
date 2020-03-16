class Solution {
    public boolean backspaceCompare(String S, String T) {
        return backspace(S).equals(backspace(T));
    }
    
    public String backspace(String text) {
        char[] s = text.toCharArray();
        String result = "";
        for(int i = 0 ; i < s.length; i++) {
            if(s[i]=='#') {
                if(result.length() > 0) {
                    result = result.substring(0, result.length()- 1);    
                } else {
                    result ="";
                }
            } else {
                result += s[i];    
            }
            
        }
        return result;
    }
}
