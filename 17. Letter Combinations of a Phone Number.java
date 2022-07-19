class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        rec(digits, 0, "");
        return ans;
    }

    public void rec(String digits, int index, String cur ) {
        if(cur.length() >= digits.length()) {
            if(cur.equals("")) {
                return;
            }
            ans.add(cur);
            return;
        }

        char[][] keys = new char[][]{{}, {}, {'a', 'b', 'c'}, {'d', 'e','f'}, {'g','h','i'}, {'j','k','l'}, {'m','n','o'}, {'p', 'q', 'r', 's'}, {'t','u','v'}, {'w','x','y','z'}};
        char[] key = keys[Integer.valueOf(String.valueOf(digits.charAt(index)))];

        for(int i = 0; i < key.length; i++) {

            cur += key[i];
            rec(digits, index + 1, cur);
            cur = cur.substring(0, index);
        }
    }
}
