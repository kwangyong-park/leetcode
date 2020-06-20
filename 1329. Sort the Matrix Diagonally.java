class Solution {
   public int[][] diagonalSort(int[][] mat) {

        int col = mat[0].length;
        int row = mat.length;
        int[][] ret = new int[row][col];
        for(int i = 0; i < col; i++) {
            List<Integer> sort = new ArrayList<>();
            int y = 0;
            int x = i;
            while (x < col && y < row) {
                sort.add(mat[y++][x++]);
            }
            Collections.sort(sort);
            y = 0;
            x = i;
            for(int value : sort ){
                ret[y++][x++] = value;
            }
        }
        for(int i = 1; i < row; i++) {
            int y = i;
            int x = 0;
            List<Integer> sort = new ArrayList<>();
            while (x < col && y < row) {
                sort.add(mat[y++][x++]);
            }
            Collections.sort(sort);
             y = i;
             x = 0;
            for(int value : sort ){
                ret[y++][x++] = value;
            }
        }
        return ret;

    }
}
