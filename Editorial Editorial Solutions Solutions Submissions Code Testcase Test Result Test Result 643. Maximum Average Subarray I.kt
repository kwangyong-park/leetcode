class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var left = 0
        var right = k - 1
        var sum = 0
        var ans = 0
        for (i in 0..right) {
            sum += nums[i]
        }
        ans = sum
        while (right < nums.size - 1) {
            sum -= nums[left]
            left++
            right++
            sum += nums[right]
            ans = maxOf(sum, ans)
        }
        return ans.toDouble() / k
    }
}
