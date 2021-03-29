class Solution {
Map<Integer, List<Employee>> parents = new HashMap<>();
	class Employee {
		int time;
		int id;
		public Employee(int id, int time) {
			this.time = time;
			this.id = id;
		}

		public List<Employee> getChildren() {
			return parents.get(this.id) == null ? new ArrayList<>(): parents.get(this.id);
		}
	}
	public int numOfMinutes(int n, int headID, int[] managers, int[] informTime) {
		Employee head = null;
		for(int i = 0 ; i < managers.length; i++ ) {
			Employee employee = new Employee(i, informTime[i]);
			if(headID == i) {
				head = employee;
			}
			List<Employee> list = parents.getOrDefault(managers[i], new ArrayList<>());
			list.add(employee);
			parents.put(managers[i], list);
		}

		return rec(head, 0);
	}

	public int rec(Employee cur, int time) {
		if(cur.getChildren().size() == 0) {
			return time;
		}

		int max = time;
		for(Employee child : cur.getChildren()) {
			max = Math.max(rec(child, cur.time + time), max);
		}
		return max;
	}
}
