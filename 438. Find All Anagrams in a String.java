class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] P = p.toCharArray();
        Arrays.sort(P);
        List<Integer> ret = new ArrayList<>();
        for(int i = 0 ; i < s.length(); i++) {

            ss: if(i + P.length <= s.length()) {
                char[] S = s.substring(i, i + P.length).toCharArray();
                Arrays.sort(S);
                for(int j = 0; j < P.length; j++) {
                    if(S[j] != P[j]) {
                        break ss;
                    }
                }
                ret.add(i);
            }
        }
        return ret;
    }
}
