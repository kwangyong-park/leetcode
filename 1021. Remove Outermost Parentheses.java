class Solution {
     public String removeOuterParentheses(String S) {

        Stack<Character> stack = new Stack<>();
        StringBuffer ret = new StringBuffer();
        StringBuffer sub = new StringBuffer();
        for(char c : S.toCharArray()) {
            if(c == '(') {
                stack.add(c);
            } else {
                stack.pop();
            }
            sub.append(c);

            if(stack.isEmpty() && sub.length() > 0) {
                
                ret.append(sub.toString().substring(1, sub.length() - 1));
                sub = new StringBuffer();
            }

        }

        return ret.toString();
    }
}
