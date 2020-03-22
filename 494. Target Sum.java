class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        bk(nums, S, 0, 0);
        return count;
    }
    
    public void bk(int[] nums, int S, int pivot, int sum) {
        if(pivot > nums.length-1) {
            if(sum == S) {
               count+=1; 
            }
            return;
        }
        bk(nums, S, pivot + 1, sum - nums[pivot]);
        bk(nums, S, pivot + 1, sum + nums[pivot]);
    }
}
