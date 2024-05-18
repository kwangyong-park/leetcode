class Solution {
    var ans = 0
    fun distributeCoins(root: TreeNode?): Int {
        test(root)
        return ans
    }

    fun test(root: TreeNode?): Int {
        if(root == null) {
            return 0
        }

        val left = test(root.left)
        val right = test(root.right)
        ans = ans + Math.abs(left) + Math.abs(right)
        return (root.`val` - 1) + left + right
    }
}
