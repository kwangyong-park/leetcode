class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        int idx = 0;
        
        checker: while(true) {
            for(int i = 0; i < strs.length; i++) {
                if(strs[i].length() == idx) {
                    System.out.println("1");
                    break checker;
                }
                if(strs[0].charAt(idx) != strs[i].charAt(idx)) {
                    System.out.println("2");
                    break checker;
                } 
            }
            idx++;
            
        }
        if(idx == 0) {
            return "";
        }
        
        return strs[0].substring(0, idx);  
        
    }
}
