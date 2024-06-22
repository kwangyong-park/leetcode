class Solution {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        var left = 0
        var ans = 0
        var oddCnt = 0
        var count = 0

        for (right in nums.indices) {
            if (nums[right] % 2 == 1) {
                oddCnt++
                count = 0
            }

            while (oddCnt == k) {
                if (nums[left] % 2 == 1) {
                    oddCnt--
                }
                left++
                count++
            }

            ans += count
        }

        return ans
    }
}
