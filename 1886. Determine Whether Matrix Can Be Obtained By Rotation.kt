class Solution {
    fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        outer@ for (k in 0..3) { // 4회 회전
            if (equals(mat, target)) { // 회전 후 행렬이 목표 행렬과 일치하는지 검사
                return true
            }
            rotate90Degrees(mat) // mat을 90도 회전
        }
        return false
    }

    private fun rotate90Degrees(matrix: Array<IntArray>) {
        val n = matrix.size
        // 행렬을 전치
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        // 각 행을 뒤집음
        for (row in matrix) {
            row.reverse()
        }
    }

    // 행렬이 동일한지 검사
    private fun equals(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        for (i in mat.indices) {
            for (j in mat.indices) {
                if (mat[i][j] != target[i][j]) {
                    return false
                }
            }
        }
        return true
    }
}
