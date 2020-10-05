class Solution {
    public int[][] kClosest(int[][] points, int K) {

        TreeMap<Double, List<int[]>> map = new TreeMap<>();
        for(int[] point: points) {
            double key = getDistance(point[0], point[1]);
            List<int[]> list = map.getOrDefault(key, new ArrayList<>());
            list.add(point);
            map.put(key, list);
        }
        int[][] ret = new int[K][2];
        int idx = 0;
        while(idx < K) {
            for(int[] list: map.pollFirstEntry().getValue()) {
                ret[idx++] = list;
            }
        }
        return ret;
    }
    double getDistance(int x, int y){
        return Math.sqrt(Math.pow(Math.abs(x-0), 2) + Math.pow(Math.abs(y-0), 2));
    }

}
