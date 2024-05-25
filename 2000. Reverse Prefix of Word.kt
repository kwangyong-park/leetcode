class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        val index = word.indexOf(ch)
        if (index == -1) {
            return word
        }
        val prefix = word.substring(0, index + 1)
        val suffix = word.substring(index + 1)
        return prefix.reversed() + suffix
    }
}
