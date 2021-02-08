class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0 ; c < matrix[r].length; c++) {
                if(matrix[r][c] == 0) {
                    rows.add(r);
                    cols.add(c);
                }
            }
        }
        for(int row: rows) {
            for(int c = 0; c < matrix[row].length; c++) {
                matrix[row][c] = 0;       
            }
        }
        
        for(int col: cols) {
            for(int r = 0; r < matrix.length; r++) {
                matrix[r][col] = 0;       
            }
        }
    }
}
