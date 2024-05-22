class Solution {
    fun partition(s: String): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val currentList = mutableListOf<String>()
        backtrack(s, 0, currentList, result)
        return result
    }

    private fun backtrack(s: String, start: Int, currentList: MutableList<String>, result: MutableList<List<String>>) {
        if (start >= s.length) {
            result.add(ArrayList(currentList))
            return
        }
        for (end in start until s.length) {
            if (isPalindrome(s, start, end)) {
                currentList.add(s.substring(start, end + 1))
                backtrack(s, end + 1, currentList, result)
                currentList.removeAt(currentList.size - 1)
            }
        }
    }

    private fun isPalindrome(s: String, low: Int, high: Int): Boolean {
        var lowIndex = low
        var highIndex = high
        while (lowIndex < highIndex) {
            if (s[lowIndex] != s[highIndex]) {
                return false
            }
            lowIndex++
            highIndex--
        }
        return true
    }
}
