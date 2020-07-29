class Solution {
   public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Pair<Integer, Integer>> m = new HashMap<>();
        PriorityQueue<Pair<Integer, Integer>> p = new PriorityQueue<>((o1, o2) -> {
            if(o1.getKey() <= o2.getKey()) return 1;
            return -1;
        });
        for(int i : nums) {
            Pair<Integer, Integer> pair = m.getOrDefault(i, new Pair<>(0, i));
            pair = new Pair(pair.getKey() + 1, i);
            m.put(i, pair);
        }
        for(Integer i : m.keySet()) {
            p.add(m.get(i));
        }
        int[] result = new int[k];
        for(int i = 0 ; i < k; i++) {
            result[i] = p.poll().getValue();
        }
        return result;
    }
}
