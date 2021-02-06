class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
		Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
		int ret = 0;
		
		for(int i = 1; i < points.length; i ++) {
			ret = Math.max(ret, points[i][0] - points[i-1][0]);

		}
		return ret;
	}
}
