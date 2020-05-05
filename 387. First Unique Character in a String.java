class Solution {
   
      public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        if(s.length() == 1) return 0;
        for(int i = 0; i < c.length; i++) {
            Integer r = map.get(c[i]);
            if(r != null) {
                map.put(c[i], Integer.MAX_VALUE);
            } else {
                map.put(c[i], i);
            }
        }

        int ret = Integer.MAX_VALUE;
        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getValue() != Integer.MAX_VALUE)
                ret = Math.min(ret, e.getValue());
        }

        return ret == Integer.MAX_VALUE ? -1 : ret;
    }
}
