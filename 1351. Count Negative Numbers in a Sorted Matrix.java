class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int col = grid[0].length - 1;

        for(int row = 0;  row < grid.length; row++) {
            
            while(col-1 >=0 && grid[row][col-1] < 0) {
                col--;
            }
            if(grid[row][col] < 0) {
                ans += grid[row].length - col;
            }
        }
        return ans;

    }
}
