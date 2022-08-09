class Solution {
    TreeNode pre = null;
    int ans = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;        
    }
    
    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        if(pre != null) {
            ans = Math.min(root.val - pre.val, ans);
        }
        pre = root;
        inorder(root.right);
    }
}
