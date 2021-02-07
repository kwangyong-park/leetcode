class Solution {
	final List<Integer> list = new ArrayList<>();
	final Map<Integer, Integer> map = new HashMap<>();
	public TreeNode bstToGst(TreeNode root) {
		rec(root);
		Collections.sort(list, Collections.reverseOrder());
		int sum = 0;
		for(int i : list) {	
			map.put(i, sum);
            sum +=i;
		}
        addTreeNode(root);
        return root;
	}
    
    public void addTreeNode(TreeNode treeNode) {
        if(treeNode == null) {
            return;
        }
        treeNode.val += map.get(treeNode.val);
        addTreeNode(treeNode.left);
        addTreeNode(treeNode.right);
    }

	public void rec(TreeNode root) {
		if(root == null) return;
		list.add(root.val);
		rec(root.left);
		rec(root.right);
	}

}
