class Solution {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        rec(root, k);
        return list.get(k-1);
    }
    
    public void rec(TreeNode root, int k) {
        if(root == null) return;
        rec(root.left, k);
        list.add(root.val);
        if(root.val == k) {
            return;
        }
        rec(root.right, k);
    }
}
