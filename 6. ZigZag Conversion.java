class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> lists = new ArrayList<>();
        numRows--;
        if(numRows == 0) return s;
        int arrow = 1;
        int cur = -1;
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()) {
            cur+=arrow;
            if(cur >= lists.size()) {
                lists.add(new ArrayList<>());
            }

            lists.get(cur).add(c);
            if(cur == numRows) {
                arrow *= -1;
            } else if(cur == 0 && arrow == -1) {
                arrow *= -1;
            }
        }
        for(List<Character> characters : lists) {
            for(char c : characters)
                sb.append(c);
        }
        return sb.toString();
    }
}
