class Solution {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[0].length; y++) {
                max = Math.max(dfs(grid, x , y, 0), max);
            }
        }
        return max;
    }

    public int dfs(int[][] grid, int x, int y, int sum) {
        if(grid.length-1 < x || grid[0].length-1 < y || x < 0 || y < 0) return sum;
        if(grid[x][y] == 0) return sum;
        int[][] arrow = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int max = sum;
        for(int i = 0 ; i< arrow.length; i++) {
            int nextX = arrow[i][0] + x;
            int nextY = arrow[i][1] + y;
            int temp = grid[x][y];
            grid[x][y] = 0;
            max = Math.max(dfs(grid, nextX, nextY, sum + temp), max);
            grid[x][y] = temp;
        }
        return max;
    }
}
