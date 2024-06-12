class Solution {
    fun fib(n: Int): Int {
           if (n == 1) {
            return 1
        }
        var dp = IntArray(50)

        dp[1] = 1
        dp[2] = 1

        for (i in 3 until n + 1) {
            dp[i] = dp[i - 1] +  dp[i - 2]
        }
        return dp[n]
    }
}
