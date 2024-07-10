class Solution {
    fun rob(nums: IntArray): Int {
        val maxRob = IntArray(nums.size + 1) { 0 }
        val N = nums.size
        maxRob[N] = 0
        maxRob[N-1] = nums[N-1]

        for (i in N-2 downTo 0) {
            maxRob[i] = Math.max(maxRob[i+2] + nums[i], maxRob[i+1])
        }

       return maxRob[0]
    }
}
