class Solution {
   public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : cpdomains) {
            String[] args = s.split(" ");
            int cnt = Integer.valueOf(args[0]);
            String[] domains = args[1].split("\\.");
            String merge = "";
            for(int i = domains.length-1; i >= 0; i --) {
                if(merge.equals(""))
                    merge =domains[i];
                else
                    merge = domains[i]+"."+merge;
                map.put(merge, map.getOrDefault(merge, 0)+cnt);
            }
        }

        return map.entrySet().stream().map(e -> e.getValue() + " " + e.getKey()).collect(Collectors.toList());
    }

}
