class Solution {
    int ans = 0;
    Map<Integer, Integer> checked = new HashMap<>();
    public int rob(int[] nums) {
        for(int i = 0; i < nums.length; i ++) {
            find(nums, i, nums[i]);
        }
        return ans;
    }
    
    public void find(int[] nums, int step, int sum) {
        ans = Math.max(ans, sum);
        if(step >= nums.length) {            
            return;
        }
        if(checked.getOrDefault(step, 0) >= sum) {
            return;
        }
        checked.put(step, sum);
        
        for(int i = step + 2; i < nums.length; i++) {
            find(nums, i, sum + nums[i]);
        }
    }
}
