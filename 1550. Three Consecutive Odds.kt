class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var cnt = 0
        for(i in arr) {
            if(i%2 == 1) {
                cnt++
            } else {
                cnt = 0
            }
            if(cnt == 3) {
                return true
            }
        }
        return false;
    }
}
