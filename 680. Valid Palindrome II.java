class Solution {
public boolean validPalindrome(String s) {

		int left = -1;
		int right = s.length();
		int mid = s.length() / 2;

		while(left < right) {
			left++;
			right--;
			if(s.charAt(left) != s.charAt(right)) {
				return isCheck(left +1, right, s) || isCheck(left, right-1, s);
			}
		}

		return true;
	}

	public  boolean isCheck(int left, int right, String s) {
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
