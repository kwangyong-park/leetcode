class Solution {
    public final TreeNode getTargetCopy(final TreeNode org, final TreeNode clone, final TreeNode t) {
        if(org == null || clone == null) return null;
        
        if(org.val == t.val) {
            return clone;
        }
        
        TreeNode left = getTargetCopy(org.left, clone.left, t);
        if(left != null) {
            return left;
        }
        
        TreeNode right = getTargetCopy(org.right, clone.right, t);
        return right;
    }
}
