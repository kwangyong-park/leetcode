class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord)) return 0;
        Set<String> check = new HashSet<>();
        Queue<Pair<String, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(beginWord, 1));

        while(!q.isEmpty()) {
            Pair<String, Integer> now = q.poll();
            System.out.println(now);
            if(isNext(now.getKey(), endWord)) {
                return now.getValue() + 1;
            }

            for(String word : wordList) {
                if(isNext(now.getKey(), word) && !check.contains(word)) {
                    check.add(word);
                    q.add(new Pair<>(word, now.getValue() + 1));
                }
            }
        }

        return 0;
    }

    public boolean isNext(String a, String b) {
        if(a.length() != b.length()) return false;
        int cur = 0;
        int miss = 0;

        while(cur < a.length()) {
            if(a.charAt(cur) != b.charAt(cur))
                miss++;
            if(miss > 1)
                return false;
            cur++;
        }
        return true;
    }
}
