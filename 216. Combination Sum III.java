class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        perm(n, k, 1, new ArrayList<>());
        return ret;
    }

    public void perm(int N, int K, int i, List<Integer> list) {
        if(list.size() == K) {
            int sum = 0;
            for(int v : list) {
                sum+=v;
            }
            if(sum == N) {
                ret.add(new ArrayList(list));
            }
            return;
        }

        for(; i <= 9; i++) {
            list.add(i);
            perm(N, K, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
