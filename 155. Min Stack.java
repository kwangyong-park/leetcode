class MinStack {

    /** initialize your data structure here. */
    Stack<int[]> stack;
    List<Integer> sorted;
    public MinStack() {
        stack = new Stack();
        sorted = new ArrayList();
    }
    
    public void push(int x) {
        sorted.add(x);
        Collections.sort(sorted);
        stack.push(new int[]{x ,sorted.get(0) });
    }
    
    public void pop() {
        int[] vals = stack.pop();
        sorted.remove((Integer) vals[0]);
    }
    
    public int top() {
        
        return stack.peek()[0];        
    }
    
    public int getMin() {
        
        return stack.peek()[1];   
    }
}
