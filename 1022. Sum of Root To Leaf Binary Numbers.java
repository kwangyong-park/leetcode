class Solution {
    List<String> array = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        perm(root, "");
    
        int sum = 0;
        for(String value: array) {
            sum +=Integer.valueOf(value, 2);
        }
        return sum;
    }
    
    public void perm(TreeNode root, String str) {
        
        if(root.left != null) 
            perm(root.left, str + root.val);
        if(root.right != null)
            perm(root.right, str + root.val);
        if(root.left == null && root.right == null)
            array.add(str + root.val);
    }
}
