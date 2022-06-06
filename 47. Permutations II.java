class Solution {
   	Set<String> dp = new HashSet<>();
	List<List<Integer>> ans = new ArrayList<>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		rec(new ArrayList<>(), nums);
		return ans;
	}

	public void rec(List<Integer> value, int[] nums) {
		if(value.size() == nums.length) {
			String key = value.stream().map(i -> nums[i]).map(String::valueOf).collect(Collectors.joining(","));
			if (dp.contains(key)) {
				return;
			}
			dp.add(key);

			List<Integer> result = value.stream().map(i -> nums[i]).collect(Collectors.toList());
			ans.add(result);
			return;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(value.contains(i)){
				continue;
			}
			value.add(i);
			rec(value, nums);
			value.remove(value.size() - 1);
		}
	}
}
