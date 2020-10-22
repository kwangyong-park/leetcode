class Solution {
     public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> remove = new HashSet<>();
        String ret  ="";

        for(int i  = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.add(i);
            } else if(s.charAt(i) == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    remove.add(i);
                }
            }
        }
        while(!stack.isEmpty()) remove.add(stack.pop());

        for(int i = 0 ; i < s.length(); i++) {
            if(!remove.contains(i)) ret += s.charAt(i);
        }

        return ret;
    }
}
