class Solution {
    Map<Integer, TreeNode> map = new HashMap<>();
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rec(root, 0, 0);
        for(int i = 0; i < map.size(); i++) {
            ans.add(map.get(i).val);
        }
        return ans;
    }

    public void rec(TreeNode root, int depth, int weight) {
        if(root == null)  {
            return;
        }
        map.put(depth, root);
        rec(root.left, depth + 1, weight);
        rec(root.right, depth + 1, weight + 1);
    }
}
