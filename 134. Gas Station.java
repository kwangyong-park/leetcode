class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int start = 0, tank = 0;

		int allGas = Arrays.stream(gas).sum();
		int allCost = Arrays.stream(cost).sum();
		for(int i = 0; i < gas.length; i++) {
			if(tank < 0) { // tank가 0보다 작은경우 실패한 케이스기때문에 초기화한다.
				start = i;
				tank = 0;
			}
			tank += gas[i];
			tank -= cost[i];
		}
		if(allGas < allCost) { // 가스보다 비용이 큰 경우는 무조건 실패한다고 볼 수 있다.
			return -1;
		}
		return start;
	}
}
