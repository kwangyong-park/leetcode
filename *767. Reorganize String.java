class Solution {
    public String reorganizeString(String S) {
        char[] s = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        char[] ret = new char[s.length];
        int pivot = 0;
        for(int i = 0; i < s.length; i++) {
            if(pivot == 0) {
                ret[pivot++] = s[i];
                continue;
            } else {
                if(ret[pivot-1] == s[i]) {
                    stack.add(s[i]);
                    pivot++;
                } else {
                    
                }
            }
            
        }
        return new String(ret);
    }
}
