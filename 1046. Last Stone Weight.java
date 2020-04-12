class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue(Collections.reverseOrder());
        for (int n : stones) { q.add(n); }
        while (q.size() > 0) {
            Integer y = q.poll();
            Integer x = q.poll();
            if (x == null) { return y; }
            if (y > x) {
                q.add(y - x);
            }
        }
        return 0;
    }
}
