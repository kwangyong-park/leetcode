class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        score.sort
        val sortedScore = score.sortedArrayDescending()
        val map = sortedScore.mapIndexed { index, i -> i to index + 1 }.toMap()
        return score.map {
            when (val rank = map[it]!!) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> rank.toString()
            }
        }.toTypedArray()
    }
}
