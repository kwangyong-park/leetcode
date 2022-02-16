class Solution {
    public int minTimeToType(String word) {
        int t = word.length();
        char p = 'a';
        for (int i=0;i<word.length();i++) {
            char c = word.charAt(i);
            if (p!=c) {
                t += Math.min(Math.abs(p-c),(26-Math.abs(p-c)));
                p = c;
            }
        }
        return t;
    }
}
