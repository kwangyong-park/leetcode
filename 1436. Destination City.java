class Solution {
  public String destCity(List<List<String>> paths) {
        String dest = null;
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i < paths.size(); i ++) {
            for(int j = 1 ; j < paths.get(i).size(); j++) {
                List<String> list = map.getOrDefault(paths.get(i).get(j - 1), new ArrayList<>());
                list.add(paths.get(i).get(j));
                map.put(paths.get(i).get(j - 1), list);
            }
        }
        
        for(String first : map.keySet()) {
            return rec(map, first, new HashMap<>());
        }
        return "";
    }

    public String rec(Map<String, List<String>> map, String cur, Map<String, String> mem) {
        if(map.get(cur) == null) {
            return cur;
        }
        if(mem.containsKey(cur)) {
            return mem.get(cur);
        }
        for(String next : map.get(cur)) {
            mem.put(cur, rec(map, next, mem));
        }
        return mem.get(cur);
    }

}
