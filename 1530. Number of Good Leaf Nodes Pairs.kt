class Solution {
    fun countPairs(root: TreeNode?, distance: Int): Int {
        var cnt = 0;

        fun dfs(root: TreeNode?, distance: Int, depth: Int): List<Int> {
            if(root == null) return listOf()

            if(root.left == null && root.right == null) {
                return listOf(depth)
            }
            val left = dfs(root.left, distance, depth + 1)
            val right = dfs(root.right, distance, depth + 1)
            for(i in left) {
                for(j in right) {
                    if((i - depth) + (j - depth) <= distance) {
                        cnt++
                    }
                }
            }
            return left + right
        }
        dfs(root, distance, 0)
        return cnt
    }
}
