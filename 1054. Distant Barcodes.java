import javafx.util.Pair;

import java.util.*;

class Solution {

    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<Pair<Integer, Integer>>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if (o1.getKey() < o2.getKey()) return 1;
                return -1;
            }

            @Override
            public boolean equals(Object obj) {

                return false;
            }
        });

        Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();
        for (int i : barcodes) {
            Pair<Integer, Integer> p = map.getOrDefault(i, new Pair<Integer, Integer>(0, i));
            map.put(i, new Pair<>(p.getKey() + 1, i));
        }
        for (Map.Entry<Integer, Pair<Integer, Integer>> pair : map.entrySet()) {
            queue.add(pair.getValue());
        }

        int[] result = new int[barcodes.length];
        int idx = 0;

        while (!queue.isEmpty()) {
            Pair<Integer, Integer> peek = queue.peek();

            if (idx > 0 && peek != null && peek.getValue() == result[idx - 1]) {
                queue.poll();
            }
            Pair<Integer, Integer> poll = queue.poll();
            int cnt = poll.getKey() - 1;

            if (cnt > 0) {
                queue.add(new Pair<>(cnt, poll.getValue()));
            }
            result[idx] = poll.getValue();

            if (idx > 0 && peek != null && peek.getValue() == result[idx - 1]) {
                queue.add(peek);
            }
            idx++;

        }
        return result;
    }

}
