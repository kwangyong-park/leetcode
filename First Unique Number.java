class FirstUnique {
    int seq = 0;
    class Node {
        int val;
        int cnt = 1;
        int createdAt = seq++;
        public Node(int val) {
            this.val = val;
        }
    }

    Map<Integer, Node > map = new HashMap<>();
    PriorityQueue<Node> p = new PriorityQueue<>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            if(o1.cnt == o2.cnt) {
                if(o1.createdAt > o2.createdAt) {
                    return 1;
                } else {
                    return -1;
                }
            }
            if(o1.cnt > o2.cnt) return 1;
            else return -1;
        }
    });
    public FirstUnique(int[] nums) {
        for(int i : nums) {
            add(i);
        }
    }

    public int showFirstUnique() {
        return p.size() > 0 ? p.peek().cnt == 1 ? p.peek().val : -1 : -1;
    }

    public void add(int value) {
        Node node = map.get(value);
        if(node == null) {
            node = new Node(value);
            p.add(node);
            map.put(value, node);
        } else if(node.cnt == 1) {
            p.remove(node);
            node.cnt++;
        }
    }
}
