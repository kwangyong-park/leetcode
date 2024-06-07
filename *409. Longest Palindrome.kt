fun longestPalindrome(s: String): Int {
    val charCount = mutableMapOf<Char, Int>()

    // 문자별로 빈도수 셈
    for (char in s) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    var length = 0
    var hasOdd = false

    // 팰린드롬 길이 계산
    for ((_, count) in charCount) {
        if (count % 2 == 0) {
            length += count
        } else {
            length += count - 1  // 홀수인 경우 하나를 빼서 짝수로 만듦
            hasOdd = true        // 중앙에 올 홀수 문자가 존재
        }
    }

    // 중앙에 홀수 문자를 하나 둘 수 있다면 길이 +1
    if (hasOdd) {
        length += 1
    }

    return length
}
