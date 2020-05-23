class Solution {
    public int countSquares(int[][] matrix) {
        int cnt = 0, col = matrix[0].length, row = matrix.length; 
        for(int i = 0 ; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(j == 0 || i == 0) {
                    cnt +=matrix[i][j];
                    continue;
                }
                if(matrix[i][j] != 0) {
                    int square = Math.min(matrix[i][j-1], Math.min(matrix[i-1][j], matrix[i-1][j-1])) + 1;
                    matrix[i][j] = square;
                    cnt+=square;
                }
            }
        }
        return cnt;
    }
}
