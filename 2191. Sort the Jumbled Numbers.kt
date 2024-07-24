class Solution {
    fun sortJumbled(mapping: IntArray, nums: IntArray): IntArray {
        val ans = mutableListOf<Pair<Int, Long>>()
        for (num in nums) {
            if (num == 0) {
                ans.add(num to mapping[0].toLong())
            } else {
                var number = num
                val digits = mutableListOf<Int>()
                while (number > 0) {
                    val digit = number % 10
                    digits.add(digit)
                    number /= 10
                }
                digits.reverse()
                val mapped = digits.map { mapping[it] }.joinToString("").toLong()
                ans.add(num to mapped)
            }
        }

        val sorted = ans.sortedBy { it.second }.map { it.first }
        return sorted.toIntArray()
    }
}
