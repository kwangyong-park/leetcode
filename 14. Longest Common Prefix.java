class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        char[] a = strs[0].toCharArray();
        for(int i = 1 ; i < strs.length; i++) {
            char[] b = strs[i].toCharArray();
            char[] n = new char[a.length];
            for(int j = 0; j < b.length; j++) {                                
                if(a.length-1 < j) {
                    break;
                }
                if(a[j] == b[j]) {
                    n[j] = a[j];
                } else {
                    break;
                }
            }
            a = n;
            
        }
        if(a.length == 0) {
            return "";
        }
        return new String(a).trim();
        
    }
}
