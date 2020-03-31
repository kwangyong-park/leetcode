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
    Set<Integer> set = new HashSet<Integer>();
    List<TreeNode> result = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
        for(int i : to_delete) {
            set.add(i);
        }
        
        if(!bfs(root)) {
            result.add(0,root);
        }
        if(result.isEmpty()) {
            result.add(root);
        }
        return result;
    }
    
    public boolean bfs(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(bfs(root.left)) {
            root.left = null;
        }
        
        if(bfs(root.right)) {
            root.right = null;
        }
        
        if(set.contains(root.val)) {
            if(!bfs(root.left)){
                result.add(root.left);
            }
            if(!bfs(root.right)) {
                result.add(root.right);
            }
            root.left = null;
            root.right = null;
            return true;
        } 
        return false;
    }
}
