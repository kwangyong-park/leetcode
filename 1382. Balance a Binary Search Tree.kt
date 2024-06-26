class Solution {
    val values = mutableListOf<Int>()
    fun findValues(root: TreeNode?) {
        root?.let {
            values.add(it.`val`)
            findValues(it.left)
            findValues(it.right)
        }
    }
    fun balanceBST(root: TreeNode?): TreeNode? {
        findValues(root)
        values.sort()
        return makeTree(0, values.size - 1)
    }
    fun makeTree(left: Int, right: Int): TreeNode? {
        if (left > right) return null

        val mid = left + (right - left) / 2
        val cur = TreeNode(values[mid])
        cur.left = makeTree(left, mid - 1)
        cur.right = makeTree(mid + 1, right)
        return cur
    }
}
