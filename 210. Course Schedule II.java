class Solution {
    public int[] findOrder(int n, int[][] p) {
        int[] ret = new int[n];
        int[] indegree = new int[n];
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());

        //p[1] => p[0]
        for(int[] dest: p) {
            indegree[dest[0]]++;
            adjList.get(dest[1]).add(dest[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 0) {
                q.offer(i);
            }
        }

        int idx = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            ret[idx++] = node;
            List<Integer> lists = adjList.get(node);
            for(int dest : lists) {
                if(--indegree[dest] == 0) {
                    q.offer(dest);
                }
            }
        }

        return idx == n ? ret : new int[0];
    }
}
