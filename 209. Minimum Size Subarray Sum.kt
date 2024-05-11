class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left = 0
        var right = 0
        var minLength = Int.MAX_VALUE
        var currentSum = 0

        while (right < nums.size) {
            // Expand the window by adding the element at right pointer to current sum
            currentSum += nums[right]
            right++

            // Once currentSum is greater than or equal to target, try to shrink the window
            while (currentSum >= target) {
                minLength = minOf(minLength, right - left)
                currentSum -= nums[left]
                left++
            }
        }

        // If no valid subarray is found, return 0
        return if (minLength == Int.MAX_VALUE) 0 else minLength
    }
}
