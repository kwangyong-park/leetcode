class Solution {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        if (original.size != m * n) {
            return emptyArray()
        }

        val ans = Array(m) { IntArray(n) }
        var idx = 0

        for (i in 0 until m) {
            for (j in 0 until n) {
                ans[i][j] = original[idx++]
            }
        }

        return ans
    }
}
