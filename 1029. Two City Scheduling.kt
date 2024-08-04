class Solution {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        // 도시 A와 B의 비용 차이를 기준으로 정렬
        costs.sortBy { it[0] - it[1] }
        
        val n = costs.size / 2
        var totalCost = 0
        
        // 앞의 절반은 도시 A로, 뒤의 절반은 도시 B로 보냄
        for (i in 0 until n) {
            totalCost += costs[i][0] // 앞의 절반은 도시 A의 비용
            totalCost += costs[i + n][1] // 뒤의 절반은 도시 B의 비용
        }
        
        return totalCost
    }
}
