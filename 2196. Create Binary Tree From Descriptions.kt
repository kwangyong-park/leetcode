class Solution {
    fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? {
        val map = mutableMapOf<Int,TreeNode>()
        val isParentChecked = mutableSetOf<TreeNode>()
        for(description in descriptions) {
            val (root, value, isLeft) = description
            val tree = map.getOrDefault(root, TreeNode(root))
            if(isLeft == 1) {
                tree.left = map.getOrDefault(value, TreeNode(value))
                map[value] = tree.left
                isParentChecked.add(tree.left)
            } else {
                tree.right = map.getOrDefault(value, TreeNode(value))
                map[value] = tree.right
                isParentChecked.add(tree.right)
            }
            map[root] = tree
        }
        return map.values.find { !isParentChecked.contains(it) }
    }
}
