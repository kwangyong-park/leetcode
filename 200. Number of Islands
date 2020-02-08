class Solution {
    public int numIslands(char[][] grid) {
        int number = 0;
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                if(grid[x][y] == '1') {
                    dfs(x, y, grid);
                    number++;            
                }
            }
        }
        return number;
    }
    
    public void dfs(int x, int y, char[][] grid) {
        if(x > grid.length-1 || x < 0) return;
        if(y > grid[x].length-1 || y < 0) return;
        
        if(grid[x][y] == '0') {
            return;
        }
        
        grid[x][y] = '0';
        dfs(x-1, y, grid);
        dfs(x, y-1, grid);
        dfs(x, y+1, grid);
        dfs(x+1, y, grid);
       
    }
    
}
