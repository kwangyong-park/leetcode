class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(Character c : ransomNote.toCharArray()) {
            int cnt = map1.getOrDefault(c, 0);
            map1.put(c, cnt+1);
        }

        for(Character c : magazine.toCharArray()) {
            int cnt = map2.getOrDefault(c, 0);
            map2.put(c, cnt+1);
        }

        for(Map.Entry<Character, Integer> e : map1.entrySet()) {
            Integer val = map2.get(e.getKey());
            if(val == null) return false;
            else if(val < e.getValue()) return false;
            
        }
        return true;
    }
}
