class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        bk(nums, new ArrayList(), 0, result);
        return result;        
    }
    
    public void bk(int[] nums, List<Integer> tmp, int p, List<List<Integer>> result) {
        result.add(new ArrayList(tmp));
        if(p >= nums.length) {            
            return;
        }
        for(int i = p; i < nums.length; i++) {
            if( !tmp.contains(nums[i]) ) {
                tmp.add(nums[i]);
            }
            bk(nums, tmp, i+1, result);
            if(tmp.get(tmp.size() - 1) == nums[i]) {
                tmp.remove(tmp.size() - 1);
            }
        }
        
    }
}
