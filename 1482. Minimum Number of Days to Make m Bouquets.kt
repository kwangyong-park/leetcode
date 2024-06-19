class Solution {

    private fun getNumOfBouquets(bloomDay: IntArray, mid: Int, k: Int): Int {
        var numOfBouquets = 0
        var count = 0
        for (i in bloomDay.indices) {
            // If the flower is bloomed, add to the set. Else reset the count.
            if (bloomDay[i] <= mid) {
                count++
            } else {
                count = 0
            }
            if (count == k) {
                numOfBouquets++
                count = 0
            }
        }
        return numOfBouquets
    }

    // 인접한 꽃만 사용할 수 있음
    // m * k = 꽃의 개수
    // bloomDay 꽃이 개화시기
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        var start = 0
        var end = 0
        for (i in bloomDay) {
            end = maxOf(i, end)
        }
        var minDays = -1
        while (start <= end) {
            val mid = (end + start) / 2

            if (getNumOfBouquets(bloomDay, mid, k) >= m) {
                minDays = mid
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        return minDays
    }
}
