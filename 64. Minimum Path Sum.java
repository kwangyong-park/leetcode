class Solution {
       public int minPathSum(int[][] grid) {
        int X = grid.length;
        int Y = grid[0].length;
        int[][] map = new int[X][Y];

        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                int min = Integer.MAX_VALUE;
                if(x > 0) {
                    min = Math.min(min, map[x-1][y]);
                }
                if(y > 0) {
                    min = Math.min(min, map[x][y-1]);
                }
                if(min == Integer.MAX_VALUE) {
                    min = 0;    
                }
                
                map[x][y] = min + grid[x][y];
            }
        }
        return map[X-1][Y-1];
    }

}
