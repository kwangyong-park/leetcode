class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        final List<List<Integer>> result = new ArrayList<>();
        perm(nums, result, new ArrayList());
        return result;
    }
    
    public void perm(int[] nums, List<List<Integer>> array, List<Integer> temp) {
        if(nums.length == temp.size()) {
            array.add(new ArrayList(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);   
            perm(nums, array, temp);
            temp.remove(temp.size() - 1);
        }
        
    }
}
