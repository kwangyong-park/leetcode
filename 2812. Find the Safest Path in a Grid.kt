class Solution {
    private val directions = arrayOf(Pair(0, 1), Pair(0, -1), Pair(1, 0), Pair(-1, 0))

    fun maximumSafenessFactor(grid: List<List<Int>>): Int {
        val n = grid.size
        val m = grid[0].size

        val distance = Array(n) { IntArray(m) { Int.MAX_VALUE } }
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (grid[i][j] == 1) {
                    queue.add(Pair(i, j))
                    distance[i][j] = 0
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until n && ny in 0 until m && distance[nx][ny] == Int.MAX_VALUE) {
                    distance[nx][ny] = distance[x][y] + 1
                    queue.add(Pair(nx, ny))
                }
            }
        }

        var left = 0
        var right = n + m
        var result = 0

        while (left <= right) {
            val mid = (left + right) / 2
            if (canReachEnd(grid, distance, mid)) {
                result = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return result
    }

    private fun canReachEnd(grid: List<List<Int>>, distance: Array<IntArray>, minDistance: Int): Boolean {
        val n = grid.size
        val m = grid[0].size
        val visited = Array(n) { BooleanArray(m) }
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        if (distance[0][0] >= minDistance) {
            queue.add(Pair(0, 0))
            visited[0][0] = true
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()
            if (x == n - 1 && y == m - 1) {
                return true
            }
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until n && ny in 0 until m && !visited[nx][ny] && distance[nx][ny] >= minDistance) {
                    queue.add(Pair(nx, ny))
                    visited[nx][ny] = true
                }
            }
        }

        return false
    }
}
