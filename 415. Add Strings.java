class Solution {
    public String addStrings(String num1, String num2) {
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();

        int c1Idx = c1.length;
        int c2Idx = c2.length;
        int carry = 0;
        String ret = "";
        while(c1Idx > 0 || c2Idx > 0) {
            int val = 0 + carry;
            if(c1Idx >0)
                val += Integer.valueOf(c1[--c1Idx]+"");
            if(c2Idx >0)
                val += Integer.valueOf(c2[--c2Idx]+"");

            carry = val / 10;
            ret = (val%10) + ret;
        }
        if(carry > 0)
            ret = carry + ret;
        return ret;
    }
}
