class Solution {
    int maxDepth = 0;
    int ret = 0;
    public int findBottomLeftValue(TreeNode root) {
        ret = root.val;
        depth(root, 0);
        
        return ret;
    }
    
    public void depth(TreeNode root, int step) {
        if(root == null) return;
        if(step > maxDepth) {
            maxDepth = step;
            ret = root.val;
        }
        depth(root.left, step + 1  );
        depth(root.right, step + 1 );
    }
}
