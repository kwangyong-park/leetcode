class Solution {
	public List<List<Integer>> groupThePeople(int[] group) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<List<Integer>> ret = new ArrayList<>();
		for(int i = 0 ; i < group.length; i++){
			int size = group[i];
			List<Integer> list = map.getOrDefault(size, new ArrayList<>());
			list.add(i);
			if(list.size() == group[i]) {
				map.remove(size, list);
				ret.add(list);
			} else {
				map.put(size, list);
			}
		}
		return ret;
	}
}
