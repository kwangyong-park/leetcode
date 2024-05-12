class Solution {
    fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
        var result = mutableListOf<IntArray>()
        for (i in 0 until grid.size - 2) {
            result.add(IntArray(grid.size - 2))
            for (j in 0 until grid[0].size - 2) {
                var max = 0
                for (ix in i ..i + 2) {
                    for (iy in j .. j + 2) {
                        max = maxOf(grid[ix][iy], max)
                    }
                }
                result[i][j] = max
            }
        }
        return result.toTypedArray()
    }
}
