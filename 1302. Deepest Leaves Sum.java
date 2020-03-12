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
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left != null && root.right != null) {
            Result left = leaf(root.left, 1);
            Result right = leaf(root.right, 1);    
            if(left.deep == right.deep) {
                return left.val + right.val;
            } else if(left.deep < right.deep) {
                return right.val;
            } else {
                return left.val;
            }
        } else if(root.left != null) {
            return leaf(root.left, 1).val;
        } else {
            return leaf(root.right, 1).val;
        }
    }
    
    public Result leaf(TreeNode root, int deep) {
        
        if(root.left == null && root.right == null) {
            return new Result(deep + 1, root.val);
        }
        
        Result left;
        Result right;
        if(root.left != null) {
            left = leaf(root.left, deep + 1);
        } else {
            left = new Result(-1, root.val);
        }
        
        if(root.right != null) {
            right = leaf(root.right, deep + 1);
        } else {
            right = new Result(-1, root.val);
        }
        
        
        if(left.deep == right.deep) {
            return new Result(right.deep, left.val + right.val);
        } else if(left.deep > right.deep) {
            return left;
        } else {
            return right;
        }
        
    }
    
    class Result {
        int deep;
        int val;
        
        public Result(int deep, int val) {
            this.deep = deep;
            this.val = val;
        }
    }
}
