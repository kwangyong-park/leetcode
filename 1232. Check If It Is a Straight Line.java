class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
    for(int i = 1; i < coordinates.length; i++) {
      if(coordinates[i][0] - coordinates[i-1][0] != 1 ||
              coordinates[i][1] - coordinates[i-1][1] != 1) {
        return false;
      }
    }
    return true;
  }
}
