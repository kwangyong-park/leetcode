import java.util.Stack;

class Solution {

    Stack<String> sb = new Stack<>();
    char[] chars;
    public String decodeString(String s) {
        chars = s.toCharArray();
        rec(-1);
        return sb.toString();
    }

    public void rec(int pivot) {
        String text = "";
        String count = "";
        for(int i = pivot + 1; i < chars.length; i++) {
            if(chars[i] == ']') {
                sb.push(text);
                return;
            } else if(chars[i] == '[') {
                for(int k = 0; k < Integer.valueOf(count); k++) {
                    rec(i);
                }
                
            } else if((chars[i] >= 'a' && chars[i] <= 'z') ||
                        chars[i] >= 'A' && chars[i] <= 'Z') {
                text += chars[i];

            } else {
                count += chars[i] ;
            }
        }
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.decodeString("3[a2[c]]"));
    }

}
