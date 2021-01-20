class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		char[] chars = s.toCharArray();
		for(char c : chars) {
			if(c == '(' || c == '{' || c == '[')  {
				stack.push(c);
			} else {
                if(stack.isEmpty()) {
					return false;
				}
				if(c == ')' && '(' == stack.peek()) {
					stack.pop();
				} else if(c == '}' && '{' == stack.peek()) {
					stack.pop();
				} else if(c == ']' && '[' == stack.peek()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}
}
