class Solution {
    fun doubleIt(head: ListNode?): ListNode? {
        val dummy = ListNode(0, head)

        var pivot: ListNode? = dummy
        var merge = ""
        while (pivot != null) {
            merge += pivot.`val`.toString()
            if (pivot.next == null) {
                break
            }
            pivot = pivot.next
        }
        val sum = merge.toBigInteger().multiply(BigInteger.valueOf(2)).toString()
        pivot = dummy.next

        var pre = dummy
        for (i in sum.toCharArray()) {
            if (pivot == null) {
                pivot = ListNode(0)
                pre.next = pivot
            }
            pivot.`val` = i.toString().toInt()
            pre = pivot
            pivot = pivot.next
        }
        return dummy.next
    }
}
