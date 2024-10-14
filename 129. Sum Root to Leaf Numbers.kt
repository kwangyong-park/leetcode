class Solution {
    val ans = mutableListOf<Int>()
    fun sumNumbers(root: TreeNode?): Int {
        if(root == null) {
            return -1
        }
        subNum(root, "")
        return ans.sum()
    }
    fun subNum(root: TreeNode, sb: String){
        if(root.left == null && root.right == null)  {
            ans.add((sb + root.`val`).toInt() )
            return
        }
        if(root.left != null) {
            subNum(root.left, sb + root.`val`)
        }
        if(root.right != null) {
            subNum(root.right, sb + root.`val`)
        }
    }
}
