class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String upper = S.toUpperCase().replaceAll("-", "");
        char[] chars = upper.toCharArray();
        String result = "";
        if (upper.length() % K != 0) {
            result = toString(chars, 0, upper.length() % K);
        }
        for (int i = result.length(); i < chars.length; i += K) {
            if (!result.equals("")) result += "-";
            result += toString(chars, i, i + K);
        }
        return result;

    }

    public String toString(char[] chars, int i, int length) {
        String result = "";
        for (; i < length; i++) {
            result += chars[i];
        }
        return result;
    }
}
