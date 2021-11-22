class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur = head;
        List<Integer> nodes = new ArrayList<>();
        if(cur == null)
            return null;
        while(cur!= null) {
            
            nodes.add(cur.val);
            cur = cur.next;
        }
        
        int move = k % (nodes.size());
        for(int i = 0; i < move; i++) {
            int val = nodes.get(nodes.size() -1);
            System.out.println(val);
            nodes.remove((Integer)nodes.size() - 1);
            nodes.add(0, val);
        }
        
        cur = null;
        ListNode ans = null;
        
        for(int i = 0; i < nodes.size(); i++) {
            if(cur == null) {
                cur = new ListNode(nodes.get(i));
                ans = cur; 
            } else {
                cur.next = new ListNode(nodes.get(i));
                cur = cur.next;
            }
        }
         return ans;
    }
}
