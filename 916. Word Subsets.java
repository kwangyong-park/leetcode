class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
		List<String> ans = new ArrayList<>();
		int[] check = new int[26];
		for(String b: B){
			int[] count = count(b.toCharArray());
			for(char a : b.toCharArray()) {
				check[a - 'a'] = Math.max(check[a - 'a'], count[a - 'a']);
			}
		}

		check: for(String a: A) {
			int[] arr = count(a.toCharArray());
			for(int i = 0 ; i < arr.length; i++) {
				if(arr[i] < check[i]) {
					continue check;
				}
			}
			ans.add(a);
		}
		return ans;
	}
	public int[] count(char[] C) {
		int[] ans = new int[26];
		for(int c: C) {
			ans[c - 'a']++;
		}
		return ans;
	}
}
