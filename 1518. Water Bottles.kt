class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var current = numBottles
        var ans = 0
        var empty = 0
        while(current > 0) {
            val newNumBottles = (current + empty) / numExchange
            ans += newNumBottles
            empty = (current + empty) % numExchange
            current = newNumBottles
        }
        return numBottles + ans
    }
}
