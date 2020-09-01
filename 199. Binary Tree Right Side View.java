class Solution {
    Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();
    int max = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        perm(root, 0, 1);
        for(int i = 0 ; i <= max; i++) {
            ret.add(map.get(i).getValue());
        }
        return ret;
    }
    public void perm(TreeNode root, int step, int po) {
        if(root == null) return;
        if(map.get(step) == null) {
            map.put(step, new Pair(po, root.val));
        } else {
            Pair<Integer, Integer> old = map.get(step);
            if(old.getKey() < po) {
                map.put(step, new Pair(po, root.val));
            }
        }
        perm(root.right, step + 1, po);
        perm(root.left, step + 1, -1);
        max = Math.max(max, step);
    }
}
