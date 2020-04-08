class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        List<ListNode> scores = new ArrayList();
        while(head!=null) {
            scores.add(head);
            head = head.next;
        }
        return scores.get(scores.size() / 2);
    }
}
