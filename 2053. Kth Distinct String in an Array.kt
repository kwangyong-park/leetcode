class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val map = mutableMapOf<String, Int>()
        for(a in arr) {
            map[a] = map.getOrDefault(a, 0) + 1
        }
        var cnt = 0
        for(a in arr) {
            if(map[a] == 1) {
                cnt ++
            }
            if(cnt == k) {
                return a
            }
        }
        return ""        
    }
}
