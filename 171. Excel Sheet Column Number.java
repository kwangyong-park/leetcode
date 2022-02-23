class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(char a : columnTitle.toCharArray()) {
            int val = (a - 'A') + 1;
            result = (result * 26) + val;
        }
        return result;
    }
}
