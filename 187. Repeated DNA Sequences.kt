class Solution {
    fun findRepeatedDnaSequences(s: String): List<String> {
        var left = 0;
        var right = 0;
        var checked = mutableSetOf<String>()
        var result = mutableSetOf<String>()

        while(left + 10 <= s.length) {
            val sub = s.substring(left, right + 10)
            if(checked.contains(sub)) {
                result.add(sub)
            }
            checked.add(sub)
            left++
            right++
        }
        return result.toList()
    }
}
