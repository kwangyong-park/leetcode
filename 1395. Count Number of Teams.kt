class Solution {
    fun numTeams(rating: IntArray): Int {
        var count = 0
        for (i in 0 until rating.size) {
            for (j in i + 1 until rating.size) {
                for (k in j + 1 until rating.size) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k]) || (rating[i] > rating[j] && rating[j] > rating[k])) {
                        count++
                    }
                }
            }
        }
        return count
    }
}
