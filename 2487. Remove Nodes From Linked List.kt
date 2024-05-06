class Solution {
    fun removeNodes(head: ListNode?): ListNode? {
        val dummy = ListNode(Int.MAX_VALUE)
        dummy.next = head
        removeNodes(dummy, head!!)
        return dummy.next
    }

    fun removeNodes(pre: ListNode, pivot: ListNode): Boolean {
        if (pivot.next == null) {
            return false
        }
        if (pivot.`val` < pivot.next.`val`) {
            pre.next = pivot.next
            removeNodes(pre, pivot.next)
            return true
        }
        if(removeNodes(pivot, pivot.next)) {
            if(pivot.next != null) {
                if(pivot.`val` < pivot.next.`val`) {
                    pre.next = pivot.next
                    removeNodes(pre, pivot.next)
                    return true
                }
            }
        }
        return false
    }
}
