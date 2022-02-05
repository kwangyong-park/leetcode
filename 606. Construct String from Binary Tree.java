class Solution {
    public String tree2str(TreeNode t) {
        if(t == null) {
            return  "";
        }
        if(t.left == null && t.right == null) {
            return t.val + "";
        }
        String left =  t.left != null ? "("+ tree2str(t.left) +")" : "()";
        String right = t.right != null ?"(" + tree2str(t.right) + ")": "";
        
        
        return t.val + left + right;        
    }
}
