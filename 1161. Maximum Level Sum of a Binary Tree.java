/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer,Integer> depthSumMap = new HashMap<>();

    public int maxLevelSum(TreeNode root) {
        per(root, 1);
        int sum = 0;
        int depth = 0;
        for(Map.Entry<Integer, Integer> entry : depthSumMap.entrySet()) {
            if(entry.getValue() > sum) {
                sum = entry.getValue();
                depth = entry.getKey();
            }
        }
        return depth;
    }

    public void per(TreeNode node, int depth) {
        if(node == null) return;
        int sum = depthSumMap.getOrDefault(depth, 0) + node.val;
        depthSumMap.put(depth, sum);
        per(node.left, depth + 1);
        per(node.right, depth + 1);
    }
}
