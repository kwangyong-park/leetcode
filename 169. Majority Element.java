class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cur = nums[0];
        int count = 0;
        for(int n : nums) {
            if(cur == n)  {
                count++;
            } else if(cur != n) {
                cur = n;
                count = 1;
            }
            if(count > nums.length / 2) {
                return cur;
            }
        }
        return -1;
    }
}
