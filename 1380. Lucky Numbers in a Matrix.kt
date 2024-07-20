class Solution {
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {

        val row = mutableListOf<Int>()
        for(x in matrix.indices) {
            var minValue = Int.MAX_VALUE
            for(y in matrix[x].indices) {
               minValue = minOf(minValue, matrix[x][y])
            }
            row.add(minValue)
        }

        for(y in 0 until matrix[0].size) {
            var maxValue = Int.MIN_VALUE
            for (i in 0 until matrix.size) {
                maxValue = maxOf(matrix[i][y], maxValue)
            }
            if(row.contains(maxValue)) {
                return listOf(maxValue)
            }
        }
        return listOf()

    }
}
