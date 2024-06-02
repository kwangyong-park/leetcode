class Solution {
    fun scoreOfString(s: String): Int {
        val chars = s.toCharArray()
        var sum = 0
        for (i in 0 until chars.size - 1) {
            val a = chars[i]
            val b = chars[i + 1]
            sum += abs(b - a)
        }
        return sum
    }
}
