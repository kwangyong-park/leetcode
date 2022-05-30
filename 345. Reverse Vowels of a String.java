class Solution {
   	public String reverseVowels(String s) {
		List<Character> test = s.chars().filter(f -> check((char) f)).mapToObj(c -> (char)c).collect(Collectors.toList());
		Stack<Character> stack = new Stack<>();
		stack.addAll(test);

		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < s.length(); i++) {
			if(check(s.charAt(i))) {
				sb.append(stack.pop());
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public boolean check(char in) {
		char at = Character.toLowerCase(in);
		return at == 'a' || at == 'e' ||
				at == 'i' || at == 'o' || at == 'u';
	}
}
