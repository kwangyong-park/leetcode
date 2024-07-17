class Solution {
    fun delNodes(root: TreeNode?, to_delete: IntArray): List<TreeNode?> {
        val result = mutableListOf<TreeNode?>()
        rec(root, null, to_delete.toSet(), result, true)
        return result
    }

    private fun rec(root: TreeNode?, parent: TreeNode?, toDelete: Set<Int>, result: MutableList<TreeNode?>, isRoot: Boolean) {
        if (root == null) {
            return
        }

        val shouldDelete = root.`val` in toDelete
        if (isRoot && !shouldDelete) {
            result.add(root)
        }

        if (shouldDelete) {
            if (parent?.left == root) {
                parent.left = null
            } else if (parent?.right == root) {
                parent.right = null
            }
            rec(root.left, null, toDelete, result, true)
            rec(root.right, null, toDelete, result, true)
        } else {
            rec(root.left, root, toDelete, result, false)
            rec(root.right, root, toDelete, result, false)
        }
    }
}
