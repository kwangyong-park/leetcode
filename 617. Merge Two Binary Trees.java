class Solution {
    
 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null) t1 = new TreeNode(0);
        if(t2 == null) t2 = new TreeNode(0);
        TreeNode t = new TreeNode(t1.val + t2.val);
        merge(t1, t2, t);
        return t;
    }

    public void merge(TreeNode t1, TreeNode t2, TreeNode parent) {
        if(t1 == null && t2 == null) return;

        if((t1 != null && t1.left != null) || (t2 != null &&  t2.left != null)) {
            int sum = 0;
            if(t1 != null && t1.left != null) sum+=t1.left.val;
            if(t2 != null && t2.left != null) sum+=t2.left.val;
            parent.left = new TreeNode(sum);
        }
        if((t1 != null && t1.right != null) || (t2 != null &&  t2.right != null)) {
            int sum = 0;
            if(t1 != null && t1.right != null) sum+=t1.right.val;
            if(t2 != null && t2.right != null) sum+=t2.right.val;
            parent.right = new TreeNode(sum);
        }

        if(parent.left != null)
            merge(t1.left, t2.left, parent.left);
        if(parent.right != null)
            merge(t1.right, t2.right, parent.right);

    }
    
    
}
