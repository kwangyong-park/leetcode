class Solution {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        rec(root, k);
        Collections.sort(list);
        return list.get(k-1);
    }
    
    public void rec(TreeNode root, int k) {
        if(root == null) return ;
        
        list.add(root.val);
        
        rec(root.left, k);
        rec(root.right, k);
    }
}
