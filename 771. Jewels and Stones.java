class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        char[] c = S.toCharArray();
        for(int i = 0 ; i < c.length; i++) {
            map.put(c[i], map.getOrDefault(c[i], 0) + 1);
        }

        c = J.toCharArray();
        int ret = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }

        
        return set.stream().map(k -> map.getOrDefault(k, 0)).reduce(0, Integer::sum);
    }
}
