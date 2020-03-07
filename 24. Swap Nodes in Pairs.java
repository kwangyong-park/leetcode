/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode result = head.next;
        recursion(head, null, 0);
        return result;
    }

    public void recursion(ListNode node, ListNode pre, int index) {
        if(node == null) return;
        if(node.next == null) return;
        if(index%2==0) {
            ListNode temp = node;
            
            node = node.next;
            temp.next = node.next;
            node.next = temp;
            if(pre != null)  pre.next = node;
            
        }

        recursion(node.next, node, index + 1);

    }
}
