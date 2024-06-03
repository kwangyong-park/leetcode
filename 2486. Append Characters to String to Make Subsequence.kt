class Solution {
    fun appendCharacters(s: String, t: String): Int {
        var j = 0
        for (i in s.indices) {
            if(j == t.length) {
                break
            }
            if (t[j] == s[i]) {
                j++
            }
        }

        return t.length - j
    }
}
