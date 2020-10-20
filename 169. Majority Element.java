class Solution {
    public int majorityElement(int[] nums) {
        return divide(nums, 0, nums.length -1);
    }
   private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    public int divide(int[] nums, int lo, int hi) {
        if(lo == hi) return nums[lo];
        
        int mid = (hi - lo)/ 2 + lo;
        int left = divide(nums, lo, mid);
        int right = divide(nums, mid + 1, hi);
        if(left == right) return left;
        
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);
        if(Math.max(leftCount, rightCount) == leftCount) return left;
        return right;
    }
}
