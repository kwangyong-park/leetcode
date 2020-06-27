class Solution {
    int sum;
    public int sumNumbers(TreeNode root) {
        cal(root, 0);
        return sum;
    }

    public void cal(TreeNode root, int parent ) {
        if(root == null) return;
        if(root.left == null && root.right == null)
            sum += (parent * 10) + root.val;
        else {
            cal(root.left, (parent * 10) + root.val);
            cal(root.right, (parent * 10) + root.val);
        }
    }
}
