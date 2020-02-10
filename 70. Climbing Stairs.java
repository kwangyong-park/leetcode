class Solution {
    int count = 0;
    Map<Integer, Integer> mem = new HashMap();
    public int climbStairs(int n) {
        jump(n, 0);
        return mem.get(0);
    }
    public int jump(int goal, int pivot){
        if(goal == pivot){
            return 1;
        } 
        
        if(goal < pivot) {
            return 0 ;
        } 
        
        if(mem.get(pivot)!= null){
            return mem.get(pivot);
        } else {
             int val = jump(goal, pivot +1) + jump(goal, pivot +2);
            mem.put(pivot, val);
            return val;
        }            
    }
    
}
