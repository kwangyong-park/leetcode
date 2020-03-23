class Solution {
 public boolean isNStraightHand(int[] hand, int W) {

        TreeMap<Integer, Integer> sorted = new TreeMap();
        for(int i: hand) {
            sorted.computeIfPresent(i,(Integer key, Integer value) -> ++value);
            sorted.computeIfAbsent(i, k -> 1);
        }

        while(!sorted.isEmpty()) {
            Map.Entry<Integer,Integer> fi = sorted.firstEntry();
            for(int i = fi.getKey(); i < fi.getKey()+W; i++) {
                if(sorted.get(i) == null) {
                    return false;
                } else {
                    sorted.computeIfPresent(i,(Integer key, Integer value) -> --value);
                    if(sorted.get(i) == 0){
                        sorted.remove(i);
                    }
                }
            }
        }
        return true;
    }
}
