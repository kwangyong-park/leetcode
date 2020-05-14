
class Trie {
    Node node;
    class Node {
        boolean isFinished = false;
        Map<Character, Node> children = new HashMap<>();

    }
    /** Initialize your data structure here. */
    public Trie() {
        node = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        put(word.toCharArray(), 0, node);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node find = get(word.toCharArray(), 0, node);
        if(find == null) return false;
        return find.isFinished;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node find = get(prefix.toCharArray(), 0, node);
        return find != null;
    }

    private void put(char[] a, int i, Node node) {
        if(i >= a.length) {
            node.isFinished = true;
            return;
        }

        Character key = a[i];
        Node root = node.children.getOrDefault(key, new Node());
        node.children.put(key, root);
        put(a, i + 1, root);
    }

    private Node get(char[] a, int i, Node node) {
        if(i >= a.length)
            return node;
        Node root = node.children.get(a[i]);
        if(root == null) {
            return null;
        }
        return get(a, i + 1, root);
    }
}
