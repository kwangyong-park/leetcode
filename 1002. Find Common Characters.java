class Solution {
 public List<String> commonChars(String[] S) {
        int[] check = new int[32];
        Arrays.fill(check, Integer.MAX_VALUE);
        for(int b = 0; b < S.length; b++) {
            String A = S[b];
            int[] map = new int[32];
            for(int j = 0; j < A.length(); j++) {
                map[A.charAt(j) - 'a']++;
            }
            for(int j = 0; j < 32; j++) {
                check[j] = Math.min(map[j], check[j]);
            }
        }

        List<String> ret = new ArrayList<>();
        for(int i = 0 ; i < 32; i++) {
            if(check[i] == Integer.MAX_VALUE)
                continue;
            for(int k = 0; k < check[i]; k++) {
                char ch = (char) ('a' + i);
                ret.add(ch + "");
            }

        }
        return ret;

    }
}
