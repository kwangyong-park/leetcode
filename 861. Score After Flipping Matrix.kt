class Solution {
    fun matrixScore(grid: Array<IntArray>): Int {
        // 왼쪽에 0이 많으면 변경하는게 유리
        for (row in grid.indices) {
            var left = 0
            var right = grid[row].size - 1
            var leftStr = ""
            var rightStr = ""
            var leftRStr = ""
            var rightRStr = ""
            while (left < right) {
                if (grid[row][left] == 1) {
                    leftStr += 1
                    leftRStr += 0
                } else {
                    leftStr += 0
                    leftRStr += 1
                }
                if (grid[row][right] == 1) {
                    rightStr = 1.toString() + rightStr
                    rightRStr = 0.toString() + rightRStr
                } else {
                    rightStr = 0.toString() + rightStr
                    rightRStr = 1.toString() + rightRStr
                }
                left++
                right--
            }
            if (leftStr == "") {
                leftStr = grid[row][0].toString()
                leftRStr = if (grid[row][0] == 0) 1.toString() else 0.toString()
            }

            var current = (leftStr + rightStr).toInt(2)
            var reverse = (leftRStr + rightRStr).toInt(2)
            if (current < reverse) {
                toggleRow(row, grid)
            }
        }

        // 위에서 아래 부분에서 카운트 세고 그냥 1이 많은쪽으로 바꾸는게 유리함

        for (col in grid[0].indices) {
            var cntZero = 0
            var cntOne = 0
            for (row in grid.indices) {
                if (grid[row][col] == 0) {
                    cntZero++
                } else {
                    cntOne++
                }
            }
            if (cntZero > cntOne) {
                toggleCol(col, grid)
            }
        }
        return sum(grid)
    }

    fun toggleRow(row: Int, grid: Array<IntArray>): Array<IntArray> {
        for (col in grid[row].indices) {
            if (grid[row][col] == 1) {
                grid[row][col] = 0
            } else {
                grid[row][col] = 1
            }
        }
        return grid
    }

    fun toggleCol(col: Int, grid: Array<IntArray>): Array<IntArray> {
        for (row in grid.indices) {
            if (grid[row][col] == 1) {
                grid[row][col] = 0
            } else {
                grid[row][col] = 1
            }
        }
        return grid
    }

    fun sumRow(grid: IntArray): Int {
        var sb = StringBuffer()
        for (col in grid.indices) {
            sb.append(grid[col])
        }
        return sb.toString().toInt(2)
    }

    fun sum(grid: Array<IntArray>): Int {
        var result = 0
        for (row in grid.indices) {
            var sb = StringBuffer()
            for (col in grid[row].indices) {
                sb.append(grid[row][col])
            }
            result += sb.toString().toInt(2)
        }
        return result
    }
}
