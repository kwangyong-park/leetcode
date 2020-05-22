class Solution {
     public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry> list = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry);
        }

        Collections.sort(list, (Comparator<Map.Entry>) (o1, o2) -> ((Integer)o1.getValue()) > ((Integer)o2.getValue()) ? -1 : 1);
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<Character, Integer> entry : list) {
            for(int i = 0 ; i < entry.getValue(); i++)
            sb.append(entry.getKey());
        }
        return sb.toString();
    }
}
