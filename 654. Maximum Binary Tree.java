class Solution {
    
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if(nums.length == 0) {
			return null;
		}

		int max = -1;
		int idx = 0;
		for(int i = 0 ; i < nums.length; i ++) {
			if(max < nums[i]) {
				idx = i;
				max = nums[i];
			}
		}
		int[] left = new int[idx];
		int[] right = new int[nums.length - idx-1];
		System.arraycopy(nums, 0, left, 0, left.length);
		System.arraycopy(nums, idx+1, right, 0, right.length);

		TreeNode treeNode = new TreeNode(max);
		treeNode.left = constructMaximumBinaryTree(left);
		treeNode.right = constructMaximumBinaryTree(right);

		return treeNode;
	}
}
