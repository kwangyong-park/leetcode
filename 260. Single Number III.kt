class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        // Step 1: XOR all the numbers
        var xorResult = 0
        for (num in nums) {
            xorResult = xorResult xor num
        }

        // Step 2: Find a bit that is different between the two unique numbers
        val diffBit = xorResult and -xorResult

        // Step 3: Divide the numbers into two groups and XOR within each group
        var num1 = 0
        var num2 = 0
        for (num in nums) {
            if (num and diffBit != 0) {
                num1 = num1 xor num
            } else {
                num2 = num2 xor num
            }
        }

        return intArrayOf(num1, num2)
    }
}
