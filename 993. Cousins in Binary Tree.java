class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Pair<Integer, Integer> left = find(root, null, x, 0);
        Pair<Integer, Integer> right = find(root, null, y, 0);
        
        if(left == null || right == null) 
            return false;
        
        return left.getKey() != right.getKey() && left.getValue() == right.getValue();
    }
    
    public Pair<Integer, Integer> find(TreeNode root, TreeNode parent, int target, int depth) {
        if(root == null) return null;
        if(root.val == target) {
            if(parent == null) 
                return null;
            return new Pair(parent.val, depth);  
        } 
        Pair ret = find(root.left, root, target, depth + 1);
        
        return ret != null ? ret : find(root.right, root, target, depth + 1);
    }
}
