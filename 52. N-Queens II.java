
class Solution {

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        return bk(board, 0, 0);
    }

    public int bk(char[][] board, int row, int count) {

        if(board.length <= row) {
            return count+1 ;
        }

        for(int i = 0; i < board[row].length; i ++) {
            if(isCheck(board, row, i)) {
                board[row][i] = '1';
                count = bk(board, row+1, count);
                board[row][i] = '0';
            }
        }
        return count;
    }

    public boolean isCheck(char[][] board, int row, int col) {
     
        return isCrossCheck(board, row, col, -1, +1)
                && isCrossCheck(board, row, col, 0, +1)
                && isCrossCheck(board, row, col, 0, -1)
                && isCrossCheck(board, row, col, +1, 0)
                && isCrossCheck(board, row, col, -1, 0)
                && isCrossCheck(board, row, col, +1, +1)
                && isCrossCheck(board, row, col, -1, -1)
                && isCrossCheck(board, row, col, +1, -1);
    }
    public boolean isCrossCheck(char[][] board, int row, int col, int plusRow, int plusCol)  {
        if(row < 0 || col < 0 || row >= board.length || col >= board.length) {
            return true;
        }
        if(board[row][col] == '1') {
            return false;
        }
        return isCrossCheck(board, row + plusRow, col + plusCol, plusRow, plusCol);
    }
}
