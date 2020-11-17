class Solution {
    Map<Integer, Integer> even = new HashMap<>();
    Map<Integer, Integer> odd = new HashMap<>();
    public boolean isEvenOddTree(TreeNode root) {
        return rec(root, 0, true);
    }
    public boolean rec(TreeNode root, int depth, boolean isOdd) {
        if(root == null) {
            return true;
        }

        if(isOdd) {
            int val = odd.getOrDefault(depth, root.val -2);
            if(root.val % 2 == 0) return false;
            if(val >= root.val) {
                return false; 
            }
            odd.put(depth, root.val);
        } else {
            int val = even.getOrDefault(depth, root.val +2);
            if(root.val % 2 == 1) return false;
            if(val <= root.val) {                
              return false;  
            } 
            even.put(depth, root.val);
        }
        return rec(root.left, depth + 1, !isOdd) && rec(root.right, depth + 1, !isOdd);
    }
}
