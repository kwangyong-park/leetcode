class Solution {
    fun minimumDeletions(s: String): Int {
        val n = s.length
        var countB = 0
        var result = 0

        // 순회하면서 'b'의 개수를 세고, 최소 삭제 수를 계산합니다.
        for (char in s) {
            if (char == 'b') {
                countB++
            } else { // char == 'a'
                result = minOf(result + 1, countB)
            }
        }

        return result
    }
}
