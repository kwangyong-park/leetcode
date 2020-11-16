class Solution {
    int depth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        rec(root, 1);
        return depth;
    }
    public void rec(TreeNode root, int cnt) {
        if(root.left == null && root.right == null) {
            depth = Math.min(depth, cnt);
        }
        if(root.left != null) rec(root.left, cnt + 1);
        if(root.right != null) rec(root.right, cnt + 1);
    }
}
