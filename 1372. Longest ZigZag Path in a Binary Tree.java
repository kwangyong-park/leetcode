class Solution {
    public int longestZigZag(TreeNode root) {
        return dfs(root, 0, 0)-1;
    }
    public int dfs(TreeNode root, int left, int right) {
        if(root == null) {
            return Math.max(left, right);
        }
        int leftC = dfs(root.right,  0, left + 1 );
        int rightC = dfs(root.left,  right + 1, 0);
        return Math.max(leftC, rightC);
        
    }
}
