class Solution {
 public String reorganizeString(String S) {
        Map<Character, Pair<Integer,Character>> map = new HashMap<>();
        PriorityQueue<Pair<Integer,Character>> queue = new PriorityQueue<>((o1, o2) -> {
            if(o1.getKey() == o2.getKey()){
                return o2.getValue().compareTo(o2.getValue());
            }
            return o2.getKey().compareTo(o1.getKey());
        });
        for(char c : S.toCharArray()) {
            Pair<Integer, Character> pair = map.getOrDefault(c, new Pair<>(0, c));
            map.put(c, new Pair<>(pair.getKey() + 1, c));
        }

        for(Map.Entry<Character, Pair<Integer, Character>> entry: map.entrySet()) {
            queue.add(entry.getValue());
        }
        String ret = "";
        Pair<Integer,Character> poll = null;
        while(!queue.isEmpty()) {
            Pair<Integer,Character> temp = null;
            if(poll != null && poll == queue.peek()) {
                 temp = queue.poll();
            }
            if(queue.isEmpty()) {
                return "";
            }
            poll = queue.poll();
            ret+=poll.getValue();
            poll = new Pair<>(poll.getKey() - 1, poll.getValue());
            if(poll.getKey() > 0) {
                queue.add(poll);
            }
            if(temp != null) {
                queue.add(temp);
            }
            temp = null;
        }
        return ret;
    }
}
