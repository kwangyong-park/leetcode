class Solution {
public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == ']') {
                String ret = "";
                while(stack.peek() != '[') {
                    ret  += stack.pop();
                }
                stack.pop(); // [
                String cnt = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    cnt = stack.pop() + cnt;
                }
                for(int i = 0 ; i < Integer.valueOf(cnt); i++) {
                    for(int j = ret.length() -1 ; j >= 0 ; j--) {
                        stack.push(ret.charAt(j));
                    }
                }
            } else {
                stack.push(c);
            }

        }
        String ret = "";

        while(!stack.isEmpty()) {
            ret = stack.pop() + ret;
        }

        return ret;
    }
}
