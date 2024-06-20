class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        nums.sort()
        var left = 0
        var right = nums.size - 1
        var ans = mutableListOf<Int>()
        while (left <= right) {
            val mid = (left + right) / 2
            var i = mid
            var j = mid
            if (nums[mid] == target) {
                while (j < right) {
                    if (nums[j] != target) {
                        break
                    }
                    j++
                }
                while (i >= left) {
                    if (nums[i] != target) {
                        break
                    }
                    i--
                }
                for (k in i..j ) {
                    if(nums.size == k || k == -1) {
                        continue
                    }
                    if (nums[k] == target) {
                        ans.add(k)
                    }
                }
                return ans
            } else if (nums[mid] > target) {
                right--
            } else {
                left++
            }
        }
        return ans
    }
}
