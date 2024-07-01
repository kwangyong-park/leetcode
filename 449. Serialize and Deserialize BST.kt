
class Codec() {
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        if(root != null) {
            val queue: Queue<TreeNode> = LinkedList()
            queue.add(root)
            val sb = StringBuilder()
            while(queue.isNotEmpty()) {
                val node = queue.poll()
                if(node != null) {
                    sb.append(node.`val`)
                    sb.append(",")
                    queue.add(node.left)
                    queue.add(node.right)
                } else {
                    sb.append("null,")
                }
            }
            return sb.toString()
        } else {
            return ""
        }
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        if(data.isEmpty()) {
            return null
        }
        val values = data.split(",")
        val root = TreeNode(values[0].toInt())
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        var i = 1
        while(queue.isNotEmpty() && i < values.size) {
            val node = queue.poll()
            if(values[i] != "null") {
                node.left = TreeNode(values[i].toInt())
                queue.add(node.left)
            }
            i++
            if(values[i] != "null") {
                node.right = TreeNode(values[i].toInt())
                queue.add(node.right)
            }
            i++
        }
        return root
    }
}
