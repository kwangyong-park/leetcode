class Solution {
    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
        val pq = PriorityQueue<Pair<Double, IntArray>> { a, b -> a.first.compareTo(b.first) }
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i == j) continue

                val key = arr[i].toDouble() / arr[j].toDouble()
                val value = intArrayOf(arr[i], arr[j])
                pq.add(Pair(key, value))
            }
        }
        var i = 0
        while (i != k - 1) {
            pq.poll()
            i++
        }
        return pq.poll().second
    }
}
