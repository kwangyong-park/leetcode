class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(map.keySet());
        
        while (!q.isEmpty()) {
            int min = q.peek();
            int count = 0;
            while(true) {
                if(!map.containsKey(min)) {
                    if(count < 3) {
                        return false;
                    }
                    break;
                }
                map.put(min, map.get(min) - 1);
                count++;
                
                if(map.get(min) == 0) {
                    q.poll();
                }
                if (map.containsKey(min + 1) && map.get(min) + 1 > map.get(min + 1)) {

                    if (count < 3) return false;
                    break;
                }
                min++;
            }
            
        }
        
        return true;
    }
} 
