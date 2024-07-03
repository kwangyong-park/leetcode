class Solution {
    fun minDifference(nums: IntArray): Int {
        if (nums.size <= 4) return 0

        val sorted = nums.sorted()
        val n = nums.lastIndex

        return minOf(
            sorted[n - 3] - sorted[0],  // kill three largest
            sorted[n - 2] - sorted[1],  // kill two largest and one smallest
            sorted[n - 1] - sorted[2],  // kill one largest and two smallest
            sorted[n] - sorted[3]       // kill three smallest
        )
    }
}
