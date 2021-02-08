class Solution {
	public String convertToTitle(int n) {
		List<Character> list = new ArrayList<>();

		while(n > 0) {
			n--;
			System.out.println('A' + (n % 26));
			list.add((char)('A' + (n % 26)));
			n /= 26;
		}

		Collections.reverse(list);
		return list.stream().map(Object::toString).collect(Collectors.joining());
	}
}
