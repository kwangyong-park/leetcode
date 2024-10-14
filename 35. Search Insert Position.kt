class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size 
        if (nums[l] >= target) {
            return 0
        }
        while(l < r - 1) {
            var mid = (l + r) / 2

            if(nums[mid] >= target) {
                r = mid
            } else {
                l = mid
            }
        }
        return r
    }
}
