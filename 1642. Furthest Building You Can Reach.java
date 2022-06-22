class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int i = 1; i < heights.length; i++){
            if(heights[i] <= heights[i-1]) {
                continue;
            }
            queue.add(heights[i]-heights[i-1]);
            
            if(queue.size() <= ladders) {
                continue;
            }
        
            
            if((bricks -= queue.poll())<=0) {
                return i-1;
            }
        }
        return heights.length-1;
    }
}
