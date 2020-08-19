class Solution {
   
    List<List<Integer>> combineRet = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        combine1(new ArrayList<Integer>(), 0, n, k);
        return combineRet;
    }
    public void combine1(List<Integer> check, int count , int n, int k) {
        if(check.size() == k) {
            combineRet.add(check.stream().collect(Collectors.toList()));
            return;
        }
        for(int i = count+1 ; i <= n; i++) {
            check.add(i);
            combine1(check, i, n, k);
            check.remove(check.size() -1 );
        }
    }
}
