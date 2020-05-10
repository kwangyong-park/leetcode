class Solution {
    public int findJudge(int N, int[][] trust) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int[] p : trust) {
            map.put(p[1], map.getOrDefault(p[1], 0) + 1);
            set.add(p[0]);
        }
        
        for(int i = 1; i <= N; i++) {
            if(map.getOrDefault(i, 0) == (N-1)){
                if(!set.contains(i)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
