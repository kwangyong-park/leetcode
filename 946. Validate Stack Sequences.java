class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> stack = new Stack<>();
        int pop = 0;
        for(int i = 0 ; i < pushed.length; i++) {
            int pivot = pushed[i];
            stack.add(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[pop]) {
                stack.pop();
                pop++;
            }
        }
        return stack.isEmpty();
    } 
}
