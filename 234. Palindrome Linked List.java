
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null) {
            slow = slow.next;
        }
        ListNode tail = reverse(slow);
        while(tail != null){
            if(tail.val != head.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode node) { //5
        ListNode tail = null;
        while(node != null) {
            ListNode tmp = node.next;//6
            node.next = tail; //null
            tail = node;
            node = tmp;
            
        }
        return tail;
        
    }
}
