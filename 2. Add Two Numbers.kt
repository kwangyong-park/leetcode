
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var ans: ListNode = ListNode(1)
        var cur = ans

        var l1Point: ListNode? = l1
        var l2Point: ListNode? = l2
        var upper = 0
        while (l1Point !=null || l2Point != null) {
            var sum = upper
            if(l1Point != null) {
                sum += l1Point.`val`
                l1Point = l1Point.next
            }
            if(l2Point != null) {
                sum += l2Point.`val`
                l2Point = l2Point.next
            }
            upper = sum / 10
            cur.next =  ListNode(sum % 10 )
            cur = cur.next
        }
        if(upper > 0) {
            cur.next = ListNode(upper)
        }
        return ans.next
    }
}
