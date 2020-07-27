class Solution {
    int result = 0;
    Set<String> set = new HashSet<>();
    public int numTilePossibilities(String tiles) {
        char[] chars = tiles.toCharArray();
        perm(chars, new ArrayList<>());
        return set.size();
    }

    public void perm(char[] chars, List<Integer> list) {
        for(int i = 0; i < chars.length; i++) {
            if(list.contains((Integer)i)){
                continue;
            }
            result++;
            list.add((Integer)i);
            set.add(list.stream().map(c -> chars[c] + "").collect(Collectors.joining(",")));
            
            perm(chars, list);
            list.remove((Integer)i);
        }
    }
}
