class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int t = 0;

        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        for(int i = 0 ; i < tickets.length; i++) {
            queue.add(new Pair(i, tickets[i]));
        }

        while(true) {
            t++;
            Pair<Integer, Integer> cur = queue.poll();
            if(cur.getKey() == k && cur.getValue() == 1) {
                return t;
            }
            if(cur.getValue() == 1)
                continue;
            queue.add(new Pair(cur.getKey(), cur.getValue() - 1));
        }
    }
}
