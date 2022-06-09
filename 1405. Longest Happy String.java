class Solution {
    
    public String longestDiverseString(int a, int b, int c) {
        Map<Character, Integer> check = new HashMap<>();
        check.put('a', a);
        check.put('b', b);
        check.put('c', c);
        String ans = "";
        while(true) {
            List<Character> list = chars(check);
            int count = 0;
            for(Character pivot: list) {
                int length = ans.length();
                if(length >= 2 && ans.charAt(length -1) == pivot && ans.charAt(length -2) == pivot){
                    count++;
                    continue;
                } else {
                    ans += Character.toString(pivot);
                    check.put(pivot,check.get(pivot)-1);
                    break;
                }
            }
            if(count == list.size()) {
                break;
            }
        }
        return ans;
    }
    
    public List<Character> chars(Map<Character, Integer> check){
        char[] letters = new char[]{'a', 'b', 'c'};
        List<Pair<Character, Integer>> list = new ArrayList<>();
        for(char letter : letters) {
            list.add(new Pair(letter, check.get(letter)));
        }
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        
        List<Character> ans = new ArrayList<>();
        for(int i = 0 ; i < list.size(); i++) {
            for(int j = 0; j < list.get(i).getValue(); j++) {
                ans.add(list.get(i).getKey());
            }
        }
        return ans;
    }
}
