class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        if (n == 0 || k % n == 0) return  // No need to rotate

        val rotate = k % n
        nums.reverse()
        nums.reverse(0, rotate)
        nums.reverse(rotate, n)
    }
}
