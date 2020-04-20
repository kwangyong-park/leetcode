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
    public TreeNode bstFromPreorder(int[] preorder) {
        int pivot = preorder[0];
        TreeNode root = new TreeNode(pivot);
        for(int i = 1; i < preorder.length; i++) 
            make(root, preorder[i]);
        
        return root;
        
    }
    
    public void make(TreeNode root, int val) {
        if(root.val > val) {
            if(root.left != null)
                make(root.left, val);
            else 
                root.left = new TreeNode(val);
        } else {
            if(root.right != null) 
                make(root.right, val);
            else 
                root.right = new TreeNode(val);
        }
    }
}
