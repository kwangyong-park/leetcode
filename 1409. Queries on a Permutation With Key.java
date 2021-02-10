class Solution {
	public int[] processQueries(int[] queries, int m) {
		List<Integer> indexes = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for(int i = 1 ; i <= m; i++) {
			indexes.add(i);
		}

		for(int q : queries) {
			for(int i = 0 ; i < indexes.size(); i++) {
				if(q == indexes.get(i)) {
					result.add(i);
					indexes.remove(i);
					indexes.add(0, q);
				}
			}
		}
		return result.stream().mapToInt(i -> i).toArray();

	}
}
