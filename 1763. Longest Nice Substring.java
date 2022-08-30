class Solution {
    public String longestNiceSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for(char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            char a = Character.isUpperCase(s.charAt(i)) ? Character.toLowerCase(s.charAt(i)) : Character.toUpperCase(s.charAt(i));
            if(map.getOrDefault(a, 0) == 0) {
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                if(left.length() == right.length()) {
                    return left;
                }
                return left.length() > right.length() ? left : right;
            }
        }
        return s;
    }
}
