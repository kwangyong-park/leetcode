class Solution {
    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
        val items = happiness.sortedArrayDescending()
        var result = 0L
        for (i in 0 until k) {
            var sum = items[i] - i
            if(sum < 0) {
                sum = 0
            }
            result += sum
        }
        return result
    }
}
