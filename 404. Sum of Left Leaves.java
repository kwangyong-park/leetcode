class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        rec(root, false);
        return sum;
    }
    
    public void rec(TreeNode root, boolean isleft) {
        if(root == null) return;
        
        if(isleft && root.left == null && root.right == null) {
            sum+=root.val;
        }
        rec(root.left, true);
        rec(root.right, false);
    }
}
