class Solution {
   
    public List<Integer> partitionLabels(String S) {
        List<Integer> ret = new ArrayList<>();
        int[] array = new int['z'-'a' + 1];
        for(int i = 0 ; i < S.length(); i++) {
            array['z' - S.charAt(i)] = i;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < S.length(); i++){
            int start = array['z' - S.charAt(i)];
            for(int j = start; j >= i; j--) {
                if(start < array['z' - S.charAt(j)]) {
                    j = array['z' - S.charAt(j)];
                    start = array['z' - S.charAt(j)];
                }
            }
            for(int k = i; k <= start; k++ ) {
                sb.append(S.charAt(k));
            }
            ret.add(sb.length());
            sb = new StringBuffer();
            i = start;
        }
        return ret;
    }
    
}
