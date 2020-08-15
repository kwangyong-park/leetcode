class Solution {
    public int[] findOrder(int numCourses, int[][] pairs) {
        //p[1]->p[0]
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] p : pairs) {
            map.put(p[0], map.getOrDefault(p[0], 0) + 1);
            map.put(p[1], map.getOrDefault(p[1], 0));
            Set<Integer> r = graph.getOrDefault(p[1], new HashSet<>());
            r.add(p[0]);
            graph.put(p[1], r);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> p: map.entrySet()) {
            if(p.getValue() == 0) {
                q.offer(p.getKey());
            }
        }
        int idx = 0;
        int[] result = new int[numCourses];
        while(!q.isEmpty()) {
            result[idx++] = q.poll();
            if(graph.containsKey(result[idx-1]))
                for(Integer input : graph.get(result[idx-1])) {
                    int count = map.get(input) - 1;
                    if(count == 0) {
                        map.remove(input);
                        q.offer(input);
                    } else {
                        map.put(input, count);
                    }

                }
        }
        return result;
    }
}
