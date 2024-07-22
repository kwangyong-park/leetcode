class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val queue = PriorityQueue<Pair<String, Int>> {a,b -> b.second - a.second}
        for(i in names.indices) {
            queue.add(names[i] to heights[i])
        }
        val list = mutableListOf<String>()
        while (queue.isNotEmpty()) {
            list.add(queue.poll().first)
        }
        return list.toTypedArray()
    }
}
