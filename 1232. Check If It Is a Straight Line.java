class Solution {
    public boolean checkStraightLine(int[][] cd) {
        int xDiff = cd[0][0] - cd[1][0];
        int yDiff = cd[0][1] - cd[1][1];
        for(int i=1; i<cd.length-1; i++){
            if(yDiff*(cd[i][0] - cd[i+1][0]) != xDiff*(cd[i][1] - cd[i+1][1]))
                return false;
        }
        return true;
    }
}
