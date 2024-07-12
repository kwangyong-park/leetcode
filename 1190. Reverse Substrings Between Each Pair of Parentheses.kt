class Solution {
    fun reverseParentheses(s: String): String {
        val stack = mutableListOf<StringBuilder>()
        stack.add(StringBuilder())

        for (c in s) {
            when (c) {
                '(' -> {
                    stack.add(StringBuilder())
                }
                ')' -> {
                    val last = stack.removeAt(stack.size - 1).reverse()
                    stack[stack.size - 1].append(last)
                }
                else -> {
                    stack[stack.size - 1].append(c)
                }
            }
        }

        return stack[0].toString()
    }
}
