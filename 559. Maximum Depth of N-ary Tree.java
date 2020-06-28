
class Solution {
    int max = 0;
    public int maxDepth(Node root) {
        depth(root, 1);
        return max;
    }
    
    public void depth(Node node, int step) {
        if(node == null) {
            return;
        }
        max = Math.max(max, step);
        for(Node child : node.children) {
            depth(child, step + 1);
        }
    }
}
