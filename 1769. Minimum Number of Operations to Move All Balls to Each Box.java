class Solution {
	public int[] minOperations(String boxes) {
		int length = boxes.length();
		int[] ans = new int[length];
		for(int i = 0 ; i < length; i++) {
			int box = 0;
			int count = 0;
			for(int j = length-1; j >i; j--) {
				if(boxes.charAt(j) == '1') {
					box++;
				}
				count+=box;
			}
			ans[i] = count;
		}
		for(int i = length - 1; i > 0; i--) {
			int box = 0;
			int count = 0;
			for(int j = 0; j < i; j++) {
				if(boxes.charAt(j) == '1') {
					box++;
				}
				count+=box;
			}
			ans[i] += count;
		}
		return ans;
	}
}
