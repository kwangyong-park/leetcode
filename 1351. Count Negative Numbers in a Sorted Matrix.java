class Solution {
  public int countNegatives(int[][] grid) {
    int result = 0;
    for(int[] row : grid) {
      for(int col : row) {
        if(col < 0) {
          result++;
        }
      }
    }
    return result;
  }
}
