class Solution {
    fun totalFruit(fruits: IntArray): Int {
        var left = 0
        var right = 0
        val basket = mutableMapOf<Int, Int>()
        var maxFruits = 0

        while (right < fruits.size) {
            basket[fruits[right]] = basket.getOrDefault(fruits[right], 0) + 1
            right++

            while (basket.size > 2) {
                basket[fruits[left]] = basket[fruits[left]]!! - 1
                if (basket[fruits[left]] == 0) {
                    basket.remove(fruits[left])
                }
                left++
            }
            maxFruits = maxOf(maxFruits, right - left)
        }

        return maxFruits
    }
}
