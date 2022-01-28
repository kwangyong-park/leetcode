class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int ans = 0;
        for(int i = 0 ; i < k; i++){
            Arrays.sort(nums);
            nums[0]= nums[0] * -1;
        }
        for(int i = 0 ; i < nums.length; i++) {
            ans+=nums[i];
        }
        return ans;
    }
}
