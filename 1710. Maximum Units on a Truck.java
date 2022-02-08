class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> {
				return o2[1] - o1[1];
		});
        int cnt = 0;
        
        for(int i = 0 ; i < boxTypes.length; i++) {
            int[] b = boxTypes[i];
            if (truckSize >= b[0]){
                truckSize -= b[0];
                cnt += b[0] * b[1];
            } else{
                cnt += b[1] * truckSize;
                return cnt;
            }
        }
        return cnt;
    }
}
