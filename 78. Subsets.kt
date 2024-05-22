class Solution {
    val result = mutableListOf<List<Int>>()
    fun subsets(nums: IntArray): List<List<Int>> {
        backtracking(nums, 0, mutableListOf())
        return result
    }
    private fun backtracking(nums: IntArray, idx: Int, currentList: MutableList<Int>) {
        result.add(ArrayList(currentList))
        for (i in idx until nums.size) {
            currentList.add(nums[i])
            backtracking(nums, i + 1, currentList)
            currentList.removeAt(currentList.size - 1)
        }
    }
}
