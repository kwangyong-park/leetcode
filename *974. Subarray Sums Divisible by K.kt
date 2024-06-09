class Solution {
    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        var prefixSum = 0
        var count = 0
        val remainderCount = mutableMapOf(0 to 1)

        for (num in nums) {
            prefixSum += num
            var remainder = prefixSum % k

            // 코틀린의 % 연산자는 음수일 경우 음수 값을 반환할 수 있습니다.
            // 이를 보정하여 항상 양수 나머지가 되도록 합니다.
            if (remainder < 0) {
                remainder += k
            }

            count += remainderCount.getOrDefault(remainder, 0)

            remainderCount[remainder] = remainderCount.getOrDefault(remainder, 0) + 1
        }

        return count
    }
}
