class Solution {
  
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx = 1;
        for(int i = 0; i < target.length; i++) {
            while(idx++ < target[i]) {
                ans.add("Push");
                ans.add("Pop");
            }
                ans.add("Push");
        }
        return ans;
    }
}
