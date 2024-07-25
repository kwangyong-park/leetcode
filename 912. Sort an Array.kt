class Solution {
    fun sortArray(nums: IntArray): IntArray {
        if (nums.size <= 1) return nums
        val mid = nums.size / 2
        val left = sortArray(nums.sliceArray(0 until mid))
        val right = sortArray(nums.sliceArray(mid until nums.size))
        return merge(left, right)
    }

    fun merge(left: IntArray, right: IntArray): IntArray {
        var i = 0
        var j = 0
        val merged = IntArray(left.size + right.size)
        for (k in merged.indices) {
            when {
                j >= right.size -> merged[k] = left[i++]
                i >= left.size -> merged[k] = right[j++]                
                left[i] <= right[j] -> merged[k] = left[i++]
                else -> merged[k] = right[j++]
            }
        }
        return merged
    }
}
