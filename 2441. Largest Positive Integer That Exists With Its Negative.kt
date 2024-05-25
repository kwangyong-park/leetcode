class Solution {
    fun findMaxK(nums: IntArray): Int {
        nums.sort()
        
        val checked = mutableSetOf<Int>()
        for(num in nums) {
            if(num > 0)  {
                break
            }
            checked.add(kotlin.math.abs(num))
        }
        
        for(i in nums.size - 1 downTo 0) {
            if(checked.contains(nums[i])) {
                return nums[i]
            }
        }
        return -1
    }
}
