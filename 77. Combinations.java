class Solution {
   int[] hours = new int[]{1,2,4,8};
    int[] mines = new int[]{1,2,4,8,16,32};
    Set<String> ret = new HashSet<>();
    public List<String> readBinaryWatch(int num) {

        findWatch(new ArrayList<>(), 0, num, 0,0 );
        return ret.stream().collect(Collectors.toList());
    }

    public void findWatch(List<String> check, int count, int n, int hour, int min) {
        if(hour > 11 || min > 59) {
            return;
        }
        if(count == n) {
            if(min < 10) {
                ret.add(hour + ":0" + min);
            } else {
                ret.add(hour + ":" + min);
            }

            return;
        }

        for(int h : hours) {
            if(check.contains("h"+h)) continue;
            check.add("h"+h);
            findWatch(check, count + 1, n, hour + h, min);
            check.remove("h"+h);
        }
        for(int m : mines) {
            if(check.contains("m"+m)) continue;
            check.add("m"+m);
            findWatch(check, count + 1, n, hour , min + m);
            check.remove("m"+m);
        }
    }
}
