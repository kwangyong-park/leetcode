class Solution {
    fun numSteps(s: String): Int {
        var cur = s.toBigInteger(2)
        var cnt = 0
        while (!cur.equals(BigInteger.ONE)) {

            if (cur.mod(BigInteger.valueOf(2)).toInt() == 1) {
                cur = cur.add(BigInteger.ONE)
            } else {
                cur = cur.divide(BigInteger.valueOf(2))
            }
            cnt++
        }
        return cnt
    }
}
