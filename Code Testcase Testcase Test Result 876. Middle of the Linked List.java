class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // fast가 두 번 이동하고 slow가 한 번 이동하게 설정
        while (fast != null && fast.next != null) {
            slow = slow.next;       // 한 칸씩 이동
            fast = fast.next.next;  // 두 칸씩 이동
            System.out.println("slow point: "+slow.val);
            System.out.println("fast point: "+fast.val);
        }
        // fast가 끝에 도달했을 때 slow는 중간 위치
        return slow;
    }
}
