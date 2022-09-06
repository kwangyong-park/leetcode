class Solution {
    public TreeNode pruneTree(TreeNode root) {
        int sum = rec(root, 0);
        if(sum == 0) {
            return null;
        }
        return root;
    }
    public int rec(TreeNode root, int sum) {
        if(root == null) {
            return sum;
        }
        int left = rec(root.left, root.val == 1 ? sum + 1 : 0 );
        int right = rec(root.right, root.val == 1 ? sum + 1 : 0);
        if(left == 0) {
            root.left = null;
        }
        if(right == 0) {
            root.right = null;
        }
        return root.val + left + right;
    }
}
