class Solution {
    fun findLength(nums1: IntArray, nums2: IntArray): Int {
        val minArray = if (nums1.size > nums2.size) nums1 else nums2
        val maxArray = if (minArray == nums2) nums1 else nums2
        val map = mutableSetOf<String>()
        for (i in maxArray.indices) {
            val sb = mutableListOf<String>()
            sb.add(maxArray[i].toString())
            map.add("[" + maxArray[i].toString() + "]")
            for (j in i + 1 until maxArray.size) {
                sb.add(maxArray[j].toString())
                map.add(sb.toString())
            }
        }
        val sub = mutableListOf<Int>()
        var cnt = 0
        for (i in minArray.indices) {
            sub.add(minArray[i])
            cnt++
            val check = sub.toString()
            if (!map.contains(check)) {
                sub.removeFirst()
                cnt--
            }
        }
        return cnt
    }
}
