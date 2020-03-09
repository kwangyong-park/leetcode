lass Solution {
    Map<Integer,Integer> mem = new HashMap();
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        if(mem.get(N) != null) {
            return mem.get(N);
        }
        mem.put(N, fib(N-1) + fib(N-2));
        return mem.get(N);
    }
}
