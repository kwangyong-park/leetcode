
class Solution {

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        return bk(board, 0, 0);
    }

    public int bk(char[][] board, int x, int count) {

        if(board.length <= x) {
            return count+1 ;
        }

        for(int i = 0; i < board[x].length; i ++) {
            if(isCheck(board, x, i)) {
                board[x][i] = '1';
                count = bk(board, x+1, count);
                board[x][i] = '0';
            }
        }
        return count;
    }


    public boolean isCheck(char[][] board, int x, int y) {
        for(int pivot = x; pivot < board.length; pivot++) {
            if(board[pivot][y] == '1'){
                return false;
            }
        }
        for(int pivot = y; pivot < board[x].length; pivot++) {
            if(board[x][pivot] == '1'){
                return false;
            }
        }
        for(int pivot = x; pivot >=0; pivot--) {
            if(board[pivot][y] == '1'){
                return false;
            }
        }
        for(int pivot = y; pivot >=0; pivot--) {
            if(board[x][pivot] == '1'){
                return false;
            }
        }
        return isCrossCheck(board, x, y, -1, +1)
                && isCrossCheck(board, x, y, +1, +1)
                && isCrossCheck(board, x, y, -1, -1)
                && isCrossCheck(board, x, y, +1, -1);
    }
    public boolean isCrossCheck(char[][] board, int x, int y, int plusX, int plusY)  {
        if(x < 0 || y < 0 || x >= board.length || y >= board.length) {
            return true;
        }
        if(board[x][y] == '1') {
            return false;
        }
        return isCrossCheck(board, x + plusX, y + plusY, plusX, plusY);
    }
}
