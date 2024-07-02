class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
       val map = mutableMapOf<Int, Int>()
       for(i in nums1) {
           map[i] = map.getOrDefault(i, 0) + 1
       }

        val ans = mutableListOf<Int>()
        for(i in nums2) {
            if(map.contains(i)) {
                ans.add(i)
                map[i] = map[i]!! - 1
                if(map[i]!! <= 0) {
                    map.remove(i)
                }
            }
        }
        return ans.toIntArray()
    }
}
