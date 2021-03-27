class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return null;
        }
        int rootVal = 0;
        if(root1 != null) rootVal+=root1.val;
        if(root2 != null) rootVal+=root2.val;
        TreeNode result = new TreeNode(rootVal);
        result.left = mergeTrees(root1 !=null ? root1.left: null, root2 !=null ? root2.left: null);
        result.right = mergeTrees(root1 !=null ? root1.right: null, root2 !=null ? root2.right: null);
        return result;
    }
}
