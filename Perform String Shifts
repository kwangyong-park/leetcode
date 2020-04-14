class Solution {
    public String stringShift(String s, int[][] shift) {
        List<Character> chars = new LinkedList<>();
        for(char c : s.toCharArray()) {
            chars.add(c);
        }
        for(int[] c : shift) {
            int step = c[1];
            for(int i = 0; i < step; i ++) {
                if (c[0] == 0) {
                    char target = chars.get(0);
                    chars.remove(0);
                    chars.add(target);
                } else {
                    char target = chars.get(chars.size()-1);
                    chars.remove(chars.size()-1);
                    chars.add(0, target);
                }
            }
        }
        return chars.stream().map(e->e.toString()).reduce((acc, e) -> acc  + e).get();
    }
}
