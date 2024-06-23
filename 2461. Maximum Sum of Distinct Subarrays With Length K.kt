class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        var left = 0
        val countMap = mutableMapOf<Int, Int>()
        var maxSum: Long = 0
        var currentSum: Long = 0
        var duplicateCount = 0

        for (right in nums.indices) {
            val num = nums[right]
            countMap[num] = countMap.getOrDefault(num, 0) + 1

            if (countMap[num]!! > 1) {
                duplicateCount++
            }
            currentSum += num

            if (right - left + 1 > k) {
                val leftNum = nums[left]
                if (countMap[leftNum]!! > 1) {
                    duplicateCount--
                }
                countMap[leftNum] = countMap[leftNum]!! - 1
                if (countMap[leftNum] == 0) {
                    countMap.remove(leftNum)
                }
                currentSum -= leftNum
                left++
            }

            if (right - left + 1 == k && duplicateCount == 0) {
                maxSum = maxOf(maxSum, currentSum)
            }
        }
        return maxSum
    }
}
