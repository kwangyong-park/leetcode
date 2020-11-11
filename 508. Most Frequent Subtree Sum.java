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
    Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();
    PriorityQueue<Pair<Integer, Integer>> q = new PriorityQueue<>((a, b) -> b.getValue()-a.getValue());
    public int[] findFrequentTreeSum(TreeNode root) {

        sum(root);
        if(q.isEmpty()) return new int[]{};
        int cnt = q.peek().getValue();
        List<Integer> ret = new ArrayList<>();
        ret.add(q.poll().getKey());
        while(!q.isEmpty() && q.peek().getValue() == cnt) {
            ret.add(q.poll().getKey());
        }
        return ret.stream().mapToInt(i -> i).toArray();
    }

    public int sum(TreeNode root) {
        if(root == null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        int sum = root.val + left + right;
        Pair<Integer, Integer> pair = map.getOrDefault(sum, new Pair<>(sum, 0));
        if(pair.getValue() > 0) {            
            q.remove(pair);
        } 
        map.put(sum, new Pair(pair.getKey(), pair.getValue() + 1));
        q.add(pair);
        return sum;
    }
}
