class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);   
            List<String> list = map.getOrDefault(new String(chars), new ArrayList());
            list.add(s);
            map.put(new String(chars),list);
        }
        return new ArrayList(map.values());
    }
}
