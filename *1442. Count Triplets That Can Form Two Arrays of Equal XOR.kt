class Solution {
    fun countTriplets(arr: IntArray): Int {
        val n = arr.size
        val prefix = IntArray(n + 1)

        for (i in 0 until n) {
            prefix[i + 1] = prefix[i] xor arr[i]
        }
        var count = 0
        for (j in 1 until n) {
            for (k in j until n) {
                if (prefix[j - 1] == prefix[k + 1]) {
                    count += k - j + 1
                }
            }
        }
        return count
    }
}
