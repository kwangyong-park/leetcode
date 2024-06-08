class Solution {
    fun longestPalindrome(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        for (i in s.indices) {
            map[s[i]] = map.getOrDefault(s[i], 0) + 1
        }
        var ans = 0
        var mid = 0
        for (key in map.keys) {
            val pivot = map.get(key)!!
            if (pivot % 2 == 0) {
                ans += pivot
            } else if(pivot % 2 == 1 && pivot > 1){
                ans += pivot - 1
                if (pivot >= 3) {
                    mid = 1
                }
            } else if(pivot % 2 == 1 && pivot == 1) {
                mid = 1
            }
        }
        return ans + mid
    }
}
