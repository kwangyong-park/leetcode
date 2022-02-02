class Solution {
    public int[] constructRectangle(int area) {
        int low = (int)Math.sqrt(area);
        while(low > 0) {
            if (area % low == 0) {
                return new int[]{area/low, low};
            }
            low--;
        }
        return new int[]{0,0};        
    }
}
