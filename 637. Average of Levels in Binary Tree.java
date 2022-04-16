class Solution {
    Map<Integer, Pair<Integer, Long>> map = new HashMap<>();
    int maxDeepth = 0;
    public List<Double> averageOfLevels(TreeNode root) {
        rec(0, root);
        
        List<Double> ret = new ArrayList<>();        
        for(int i = 0; i <= maxDeepth; i++){
            ret.add(Double.valueOf(map.get(i).getValue()) / Double.valueOf(map.get(i).getKey()));
        }
        
        
        return ret;
    }
    
    public void rec(int deepth, TreeNode root) {
        if(root == null) {
            return;
        }
        Pair<Integer, Long> t = map.get(deepth);
        if(t == null) {
            map.put(deepth, new Pair(1, Long.valueOf(root.val)));
        } else {
            map.put(deepth, new Pair(t.getKey() + 1, t.getValue() + Long.valueOf(root.val)));
        }
        maxDeepth = Math.max(deepth, maxDeepth);
        rec(deepth + 1, root.left);
        rec(deepth + 1, root.right);
    }
}
