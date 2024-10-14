class Solution {
    fun isPalindrome(x: Int): Boolean {
        val txt = x.toString()
        
        for (i in 0 until txt.length / 2) {
            if (txt[i] != txt[txt.length - i - 1]) {
                return false
            }
        }
        return true
    }
}
