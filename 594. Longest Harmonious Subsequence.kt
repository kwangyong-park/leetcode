import java.lang.Math.abs

class Solution {
    fun findLHS(nums: IntArray): Int {
        nums.sort() // 배열을 정렬

        var left = 0
        var right = 0
        var result = 0

        while (right < nums.size) {
            val diff = abs(nums[right] - nums[left])

            if (diff == 1) {
                result = maxOf(result, right - left + 1)
                right++
            } else if (diff > 1) {
                left++
            } else {
                right++
            }
        }

        return result
    }
}
