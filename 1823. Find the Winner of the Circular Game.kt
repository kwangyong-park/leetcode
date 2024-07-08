class Solution {
    fun findTheWinner(n: Int, k: Int): Int {
        val queue:Queue<Int> = LinkedList()

        for(i in 1 until n+1) {
            queue.add(i)
        }
        var count = 0
        while(queue.size != 1) {
            count++
            if(count == k) {
                queue.remove()
                count = 0
            } else {
                queue.add(queue.poll())
            }
        }
        return queue.peek()
    }
}
