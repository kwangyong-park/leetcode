class Solution {
    public int tribonacci(int n) {
        List<Integer> list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(1);        
        for(int i = 3; i <= n; i++) {
            int fi = list.get(i - 3) + list.get(i - 2) + list.get(i - 1);
            list.add(fi); 
        }
        return list.get(n);
    }
}
