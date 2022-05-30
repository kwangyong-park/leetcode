class Solution {
    public String reverseVowels(String s) {
       int left = 0, right = s.length() -1;
       char[] ans = s.toCharArray();
       while(left < right) {
           char leftAt = s.charAt(left);
           char rightAt = s.charAt(right);
           if(check(leftAt) && check(rightAt)) {
               char temp = ans[left];
               ans[left] = ans[right];
               ans[right] = temp;
               left++;
               right--;
           } else if(!check(leftAt)) {
               left++;
           } else if(!check(rightAt)) {
               right--;
           } 
       }
        return new String(ans);
    }
    public boolean check(char in) {
        char at = Character.toLowerCase(in);
        return at == 'a' || at == 'e' || 
             at == 'i' || at == 'o' || at == 'u';
    }
}
