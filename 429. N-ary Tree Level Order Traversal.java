class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    public List<List<Integer>> levelOrder(Node root) {
        rec(1, root);
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            if(map.get(i) == null) {
                break;
            }
            ans.add(map.get(i));
        }
        return ans;
        
    }
    
    public void rec(int level, Node root)  {
        if(root == null) {
            return;
        }
        List<Integer> lists = map.getOrDefault(level, new ArrayList<>());
        lists.add(root.val);
        map.put(level, lists);
        for(Node child : root.children) {
            rec(level+1, child);        
        }
    }
}
