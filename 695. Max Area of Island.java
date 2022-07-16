class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i = 0 ; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    ans = Math.max(rec(grid, i, j, 0) , ans);
                }
            }
        }
        return ans;
    }

    public int rec(int[][] grid, int x, int y, int count) {
        if(grid.length <= x || x < 0 || grid[x].length <= y || y < 0) {
            
            return count;
        }
        if(grid[x][y] == 0) {
            
            return count;
        }
        if(grid[x][y] == 1) {
            count++;
            grid[x][y] = 0;
        }

        int[][] arrow = new int[][]{{1,0}, {0,1}, {-1, 0}, {0, -1}};
        for(int i = 0 ; i < arrow.length; i++) {
            count += rec(grid, x + arrow[i][0], y + arrow[i][1], 0);
            
        }
        return count;
    }
}
