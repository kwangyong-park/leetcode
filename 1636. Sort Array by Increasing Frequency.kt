class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val map = mutableMapOf<Int, Int>()

        for(num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        return nums.sortedWith(compareBy({ map[it] }, { -it })).toIntArray()
    }
}
