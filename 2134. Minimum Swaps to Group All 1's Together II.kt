class Solution {
    fun minSwaps(nums: IntArray): Int {
        val totalOnes = nums.sum()
        if (totalOnes == 0) return 0

        val doubledNums = nums + nums
        var currentOnes = 0
        for (i in 0 until totalOnes) {
            if (doubledNums[i] == 1) currentOnes++
        }

        var maxOnes = currentOnes

        for (i in totalOnes until doubledNums.size) {
            if (doubledNums[i] == 1) currentOnes++
            if (doubledNums[i - totalOnes] == 1) currentOnes--
            maxOnes = maxOf(maxOnes, currentOnes)
        }

        return totalOnes - maxOnes
    }
}
