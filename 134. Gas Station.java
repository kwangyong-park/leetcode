class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, tank = 0;
        if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        for(int i = 0; i < gas.length; i++) {
            if(tank < 0) {
                start = i;
                tank = 0;
            }
            tank += gas[i];
            tank -= cost[i];
        }
        return start;
    }
}
