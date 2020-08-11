//https://www.youtube.com/watch?v=ZKtfvYawM7M
class Solution {
    public boolean canFinish(int n, int[][] p) {
        Set<Integer> visisted = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < n; i++) adjList.add(new ArrayList<>());
        int[] in = new int[n];
        //edge[1]=>edge[0]
        for(int[] edge : p) {
            in[edge[0]]++;
            adjList.get(edge[1]).add(edge[0]);
        }
        for(int i = 0; i < n; i++){
            if(in[i] == 0) q.offer(i);
        }
        
        while(!q.isEmpty()) {
            int node = q.poll();
            visisted.add(node);
            for(int dest : adjList.get(node)) 
                if(--in[dest] == 0) q.offer(dest);
        }
        return visisted.size() == n;
    }
}
