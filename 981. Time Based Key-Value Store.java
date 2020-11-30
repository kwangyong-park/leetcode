class TimeMap {

  /** Initialize your data structure here. */
    Map<String, PriorityQueue<Pair<Integer, String>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        PriorityQueue<Pair<Integer, String>> queue = map.getOrDefault(key, new PriorityQueue<>((o1, o2) -> o2.getKey() - o1.getKey()));
        queue.add(new Pair<>(timestamp, value));
        map.put(key, queue);

    }
    
    public String get(String key, int timestamp) {
        if(map.get(key)== null) return "";
        PriorityQueue<Pair<Integer, String>> queue  = map.get(key);

        List<Pair<Integer, String>> poped = new ArrayList<>();
        poped.add(queue.peek());
        Pair<Integer, String> pre = queue.poll();
        while(!queue.isEmpty() && pre.getKey() > timestamp) {
            pre = queue.poll();
            poped.add(pre);
        }
        queue.addAll(poped);
        if(pre.getKey() > timestamp) {
            return "";
        }
        return pre.getValue();
    }

}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
