class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        val map = sortedMapOf<Int, Int>()
        for(edge in edges) {
            map[edge[0]] = map.getOrDefault(edge[0], 0) + 1
            map[edge[1]] = map.getOrDefault(edge[1], 0) + 1
        }
        for(key in map.keys) {
            if(map[key]!! == edges.size) {
                return key
            }
        }
        return -1
    }
}
