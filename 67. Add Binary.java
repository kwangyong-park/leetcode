class Solution {
    public String addBinary(String a, String b) {
        
        if(a.length() > b.length()) {
            b = append(b, a.length() - b.length());
        } else if(a.length() < b.length()) {
            a = append(a, b.length() - a.length());
        }
        
        String ans = "";
        boolean isCarry = false;
        for(int i = b.length() - 1; i >= 0; i--) {
            int intA = a.charAt(i) == '0' ? 0 : 1;
            int intB = b.charAt(i) == '0' ? 0 : 1;
            
            if(intA + intB == 2) {
                if(isCarry) {
                    ans = "1" + ans;
                    isCarry = true;
                } else {
                    ans = "0" + ans;
                    isCarry = true;
                }
            } else if(intA + intB == 1) {
                if(isCarry) {
                    ans = "0" + ans;
                    isCarry = true;
                } else {
                    ans = "1" + ans;
                    isCarry = false;
                }
            } else if(intA + intB == 0) {
                if(isCarry) {
                    ans = "1" + ans;
                    isCarry = false;
                } else {
                    ans = "0" + ans;
                    isCarry = false;
                }
            }
        }
        if(isCarry) {
            ans = "1" + ans;
        }
        
        return ans;
    }
    
    public String append(String text, int num) {
        for(int i = 0 ; i < num; i++)
            text = "0" + text;
        return text;
    }
}
