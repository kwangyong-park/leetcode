class Solution {
    fun rotate(matrix: Array<IntArray>) {
        // 전치행렬
        for (i in matrix.indices) {
            for (j in i + 1 until matrix[i].size) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        // reverse
        for (row in matrix) {
            row.reverse()
        }
    }
}
