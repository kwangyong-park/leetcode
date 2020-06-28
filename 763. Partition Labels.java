class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ret = new ArrayList<>();
        int[] chars = new int[32];
        for(int i = 0; i < S.length(); i++)
            chars[S.charAt(i)  - 'a'] = i;
        for(int i = 0; i < S.length(); i++) {
            int lh = chars[S.charAt(i)  - 'a'];
            int j = i;
            StringBuilder sb = new StringBuilder();
            while(j <= lh) {
                sb.append(S.charAt(j));
                lh = Math.max(chars[S.charAt(j)  - 'a'], lh);
                j++;
            }
            ret.add(sb.toString().length());
            i = j-1;
        }
        return ret;
    }
}
