class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null) {
            
            if(cur.val == val ) {
                if(pre == null) {
                    head = cur.next;
                } else {                
                    pre.next = cur.next;
                }
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
