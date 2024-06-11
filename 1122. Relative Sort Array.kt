class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val ans = IntArray(arr1.size)
        val map = mutableMapOf<Int, Int>()
        var idx = 0
        for (i in arr2) {
            if (map[i] == null) {
                map[i] = idx++
            }
        }

        val sorted = arr1.sortedBy {
            if (map[it] == null) {
                it + 2000
            } else {
                map[it]!!
            }
        }

        return sorted.toIntArray()
    }
}
