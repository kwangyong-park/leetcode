class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = mutableSetOf<Char>()
        var l = 0
        var ans = -1
        for (r in 0 until s.length) {
            val pivot = s[r]
            while (set.contains(pivot)) {
                set.remove(s[l])
                l++
            }
            set.add(pivot)
            ans = maxOf(r - l, ans)
        }
        return if (ans == -1) 0 else ans + 1
    }
}
