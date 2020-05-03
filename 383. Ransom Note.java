class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : ransomNote.toCharArray()) {
            int cnt = map.getOrDefault(c, 0);
            map.put(c, cnt+1);
        }
        
        for(Character c : magazine.toCharArray()) {
            int cnt = map.getOrDefault(c, -1);
            if(cnt > 1) {
                map.put(c, cnt-1);
            } else {
                map.remove(c);
            }
        }
        return map.size() > 0 ? false: true;
        
    }
}
