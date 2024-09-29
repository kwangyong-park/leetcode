class Solution {
    fun findMinDifference(timePoints: List<String>): Int {
        if (timePoints.size > 1440) return 0 // There are only 1440 possible unique times in a day

        val minutesList = timePoints.map { time ->
            val (hours, minutes) = time.split(":").map { it.toInt() }
            hours * 60 + minutes
        }.sorted()

        var minDifference = Int.MAX_VALUE

        // Compare consecutive time points
        for (i in 1 until minutesList.size) {
            minDifference = Math.min(minDifference, minutesList[i] - minutesList[i - 1])
        }

        // Circular check: Compare the first and the last time points
        val firstLastDiff = 1440 + minutesList[0] - minutesList.last()
        minDifference = Math.min(minDifference, firstLastDiff)

        return minDifference
    }
}
