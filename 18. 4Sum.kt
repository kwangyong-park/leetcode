class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort()
        val n = nums.size
        val result = mutableListOf<List<Int>>()
        for (i in 0 until n - 3) { // 나머지 3개의 값은 다른곳에 찾을것이기 떄문에 -3을 하는것이다.
            if (i > 0 && nums[i] == nums[i - 1]) continue // 중복된 값이 있을경우 건너뛴다.
            for (j in i + 1 until n) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue
                var left = j + 1
                var right = n - 1
                while (left < right) {
                    val sum = nums[i] + nums[j] + nums[left] + nums[right]
                    when {
                        sum == target -> {
                            val list = mutableListOf<Int>()
                            list.add(nums[i])
                            list.add(nums[j])
                            list.add(nums[left])
                            list.add(nums[right])
                            result.add(list)
                            left++
                            right--
                        }
                        sum < target -> {
                            left++
                            while (left < right && nums[left] == nums[left - 1]) left++ // 중복 스킵 추가
                        }
                        sum > target -> {
                            right--
                            while (left < right && nums[right] == nums[right + 1]) right-- // 중복 스킵 추가
                        }
                    }
                }
            }
        }
        return result
    }
}
