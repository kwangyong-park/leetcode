class Solution {
  
  public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 0) return false;
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        int left = 0;
        int right = s.length() -1;
        while(left <= right) {
            if(left == right){
                queue.add(s.charAt(left++));
                break;
            }
            queue.add(s.charAt(left++));
            stack.add(s.charAt(right--));
        }
        if(stack.size() != queue.size()) return false;

        while(!queue.isEmpty()) {
            if(queue.poll() != stack.pop()) return false;
        }
        return true;
    }
}
