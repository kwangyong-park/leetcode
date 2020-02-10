/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return dep(root, 0);
    }
    public int dep(TreeNode node, int depth) {
        if(node == null) return depth;
        int left = dep(node.left, depth +1);
        int right = dep(node.right, depth +1);
        
        return Math.max(left, right);
        
    }
}
