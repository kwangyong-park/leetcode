class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i = 0 ; i < nums.length; i ++) {
            max = Math.max(cur + nums[i], max);
            cur = Math.max(cur + nums[i], 0); 
        }
        return max;
    }
}
