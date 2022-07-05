class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1List = new ArrayList<>();
        List<Integer> root2List = new ArrayList<>();
        find(root1,  root1List);
        find(root2,  root2List);
        
        if(root1List.size() != root2List.size()) {
            return false;
        }
        for(int i = 0 ; i < root1List.size(); i++) {
            if(root1List.get(i) != root2List.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    public void find(TreeNode root, List<Integer> value) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            value.add(root.val);
            return;
        }
        find(root.left, value);
        find(root.right, value);
    }
}
