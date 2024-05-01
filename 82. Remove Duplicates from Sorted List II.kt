class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var dummy = ListNode(0, head)

        var pivot = dummy

        while (pivot.next != null) {
            var current = pivot.next
            while (current.next != null && current.next.`val` == current.`val`) {
                current = current.next
            }

            if (pivot.next === current) {
                pivot = pivot.next!!
            } else {
                // Skip all duplicates
                pivot.next = current?.next
            }
        }
        return dummy.next
    }
}
