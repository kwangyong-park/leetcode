class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        Stack<Point> points = new Stack<>();

        for(int i = 0; i < intervals.length; i++) {
            if(points.empty()) {
                points.push(new Point(intervals[i][0], intervals[i][1]));
            } else {
                int s = intervals[i][0];
                int e = intervals[i][1];
                Point point = points.pop();
                if(Math.abs(point.e - s) == 0 ||
                 Math.abs(point.s - s) == 0 || Math.abs(point.e - e) == 0 ||
                        (point.s <= s && point.e >= s)) {
                    point.s = Math.min(point.s, s);
                    point.e = Math.max(point.e, e);
                    points.push(point);
                } else {
                    points.push(point);
                    points.push(new Point(s, e));
                }
            }
        }
        int[][] result = points.stream().map(p -> new int[]{p.s, p.e}).toArray(int[][]::new);
        return result;
    }

    class Point {
        int s;
        int e;
        public Point(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

}
