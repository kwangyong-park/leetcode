class Solution {
    val directions = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    fun maximumSafenessFactor(grid: List<List<Int>>): Int {
        val distance = Array(grid.size) { IntArray(grid[0].size) { Int.MIN_VALUE } }
        val queue = LinkedList<Pair<Int, Int>>()

        for (x in grid.indices) {
            for (y in grid[x].indices) {
                if (grid[x][y] == 1) {
                    queue.add(x to y)
                    distance[x][y] = 0
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()
            for (pivotArrow in directions) {
                val (dx, dy) = pivotArrow
                val nx = x + dx
                val ny = y + dy
                if (nx in grid.indices && ny in 0 until grid[0].size && distance[nx][ny] == Int.MIN_VALUE) {
                    distance[nx][ny] = distance[x][y] + 1
                    queue.add(nx to ny)
                }
            }
        }

        var left = 0
        var right = grid.size + grid[0].size
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
