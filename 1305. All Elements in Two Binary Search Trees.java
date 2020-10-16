class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ret = new ArrayList<>();
        find(root1);
        find(root2);
        while(!pq.isEmpty()) {
            ret.add(pq.poll());
        }
        return ret;        
    }
    
    public void find(TreeNode root) {
        if(root == null) return;
        pq.add(root.val);
        find(root.left);
        find(root.right);
    } 
}
