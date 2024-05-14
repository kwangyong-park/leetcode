class Solution {
    var arrow = arrayOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)

    // 최대 골드를 얻는 함수
    fun getMaximumGold(grid: Array<IntArray>): Int {
        var result = 0
        for (x in grid.indices) {
            for (y in grid[0].indices) {
                // 골드가 있는 셀에서만 DFS를 시작
                if (grid[x][y] > 0) {
                    result = maxOf(result, dfs(x, y, 0, grid))
                }
            }
        }
        return result
    }
    private fun dfs(x: Int, y: Int, sum: Int, grid: Array<IntArray>): Int {
        // 경계 조건 및 방문 조건 검사
        if (x < 0 || y < 0 || x >= grid.size || y >= grid[0].size || grid[x][y] <= 0) {
            return sum
        }

        // 현재 셀의 골드를 임시로 저장하고 방문 표시
        val temp = grid[x][y]
        grid[x][y] = 0

        var max = sum
        // 네 방향으로 DFS 호출
        for ((dx, dy) in arrow) {
            max = maxOf(max, dfs(x + dx, y + dy, sum + temp, grid))
        }

        // 방문 표시 해제 (백트래킹)
        grid[x][y] = temp
        return max
    }
}
