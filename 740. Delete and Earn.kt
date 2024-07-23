class Solution {
    fun deleteAndEarn(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]

        val maxNum = nums.maxOrNull()!!
        val points = IntArray(maxNum + 1)

        // 각 숫자의 등장 횟수를 계산
        for (num in nums) {
            points[num] += num
        }

        // dp 배열 초기화
        val dp = IntArray(maxNum + 1)
        dp[1] = points[1]

        // 동적 프로그래밍
        for (i in 2..maxNum) {
            dp[i] = maxOf(dp[i-1], dp[i-2] + points[i])
        }

        return dp[maxNum]
    }
}
