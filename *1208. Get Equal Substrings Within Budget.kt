class Solution {
    fun equalSubstring(s: String, t: String, maxCost: Int): Int {
        var start = 0
        var totalCost = 0
        var maxLength = 0

        for (end in s.indices) {
            // 현재 문자의 변환 비용을 더합니다.
            totalCost += Math.abs(s[end].toInt() - t[end].toInt())

            // 변환 비용이 maxCost를 초과하면, 윈도우의 시작을 조절합니다.
            while (totalCost > maxCost) {
                totalCost -= Math.abs(s[start].toInt() - t[start].toInt())
                start++
            }
            // 현재 윈도우의 길이를 계산하여 최대 길이를 업데이트합니다.
            maxLength = Math.max(maxLength, end - start + 1)
        }

        return maxLength
    }
}
