class Solution {
    int ret;
    public int diameterOfBinaryTree(TreeNode root) {
        ret = 0;
        depth(root);
        return ret;
    }
    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        ret = Math.max(ret, left + right);
        return Math.max(left, right) + 1;
    }
}
