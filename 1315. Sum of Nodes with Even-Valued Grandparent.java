class Solution {
    private int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        rec(null, root); return sum;
    }
    private void rec(TreeNode pre, TreeNode cur) {
        if (cur == null) { return; }
        if (pre != null && pre.val % 2 == 0) {
            sum += cur.left != null ? cur.left.val : 0;
            sum += cur.right != null ? cur.right.val : 0;
        }
        rec(cur, cur.left);
        rec(cur, cur.right);
    }
}
