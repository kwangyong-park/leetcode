class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 1 ; i < nums.length; i+=2) {
            ans +=Math.min(nums[i-1], nums[i]);
        }
        return ans;
    }
}
