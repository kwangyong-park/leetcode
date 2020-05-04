
class Solution {
    class Node {
        int val;
        Map<Integer, Node> children = new HashMap<>();

        public Node(int val) {
            this.val = val;
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
       
        Arrays.sort(prerequisites, (o1, o2) -> {
            if(o1[1] < o2[1]) {
                return 0;
            } else {
                return 1;
            }
        });
        Map<Integer, Node> map = new HashMap<>();

        Node root = null;
        for(int[] p : prerequisites) {
            if(root == null) {
                root = new Node(p[1]);
                map.put(root.val, root);
            }
            Node parent = map.get(p[1]);
            Node node = map.getOrDefault(p[0], new Node(p[0]));
            parent.children.put(node.val, node);
            map.put(node.val, node);
        }

        List<Integer> list = new ArrayList<>();
        ret(list, root);       
        
        return list.stream().mapToInt(i->i).toArray();

    }

    public void ret(List<Integer> list, Node root) {
        if(root == null) {
            return;
        }
        if(!list.contains(root.val)) {
            list.add(root.val);
        }
        for(Map.Entry<Integer, Node> entry : root.children.entrySet()) {
            if(!list.contains(entry.getValue().val)) {
                list.add(entry.getValue().val);
            }
        }
        for(Map.Entry<Integer, Node> entry : root.children.entrySet()) {
            ret(list, entry.getValue());
        }

    }
}
