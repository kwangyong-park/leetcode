class Solution {
    fun canBeEqual(
        target: IntArray,
        arr: IntArray,
    ): Boolean {
        target.sort()
        arr.sort()
        for(i in 0 until target.size) {
            if(target[i] != arr[i]) {
                return false
            }
        }
        return true
    }
}
