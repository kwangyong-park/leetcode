public class Solution {
    Set<ListNode> checked = new HashSet<>();
    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        if(checked.contains(head)) {
            return head;
        }
        checked.add(head);
        return detectCycle(head.next);
    }
}
