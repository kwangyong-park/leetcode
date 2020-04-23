class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList();
        perm(candidates, 0, new ArrayList(), ret, 0, target);
        return ret;
    }
    
    public void perm(int[] can, int i, List<Integer> temp, List<List<Integer>> ret, int sum, int tar) {
   
        if(tar == sum) {
            List<Integer> res = new ArrayList(temp);            
            ret.add(res);
            return;
        } else if(tar < sum) {
            return;  
        } 
        
        for(; i < can.length; i++){
            temp.add(can[i]);
            perm(can, i, temp, ret, sum+can[i], tar);
            temp.remove(temp.size() - 1);
        }
    
    }
}
