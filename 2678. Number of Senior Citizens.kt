class Solution {
    fun countSeniors(details: Array<String>): Int {
        var ans = 0
        for(detail in details) {
            val first = detail[10 + 1]
            val second = detail[10 + 1 + 1]
            if("${first}${second}".toInt() >60) {
                ans++
            }
        }
        return ans
    }
}
