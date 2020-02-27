/**
*  Unsuccessful Problom
**/
class Solution {
    public void solveSudoku(char[][] board) {
      bk(board, 0);
    }
  
    public void bk(char[][] board, int row) {
      if(row >= 9) {
        return;
      }
      for(int col = 0; col < 9; col ++) {
        for(int i = 1 ; i <= 9; i ++) {
          if(check(board, (char) i, row, col)) {
            board[row][col] = (char) i ;
            bk(board, row+1);
            board[row][col] = '' ;
          }
        }
      }
    }
  
    public boolean check(char[][] board, char val, int row, int col) {
      if(!checkBox(board, val, row, col)) {
        return false;
      }
      
      return checkEach(board, val, row, col, +1, 0) && checkEach(board, val, row, col, 0, +1);
    }
  
    public boolean checkBox(char[][] board,
                         int val,
                         int row,
                         int col) {
      int box = getBox(row, col, 3, 0);
      int i = 0;
      int j = 0;
      
      if(box == 0) {
        i = 0;
        j = 0;
      } else if(box == 1) {
        i = 3;
        j = 0;
      } else if(box == 2) {
        i = 6;
        j = 0;
      } else if(box == 3) {
        i = 0;
        j = 3;
      } else if(box == 4) {
        i = 3;
        j = 3;
      } else if(box == 5) {
        i = 6;
        j = 3;
      } else if(box == 6) {
        i = 6;
        j = 0;
      } else if(box == 7) {
        i = 6;
        j = 3;
      } else if(box == 8) {
        i = 6;
        j = 6;
      } else {
        
        throw new RuntimeException("error");
      }
      
      int iE = i+3;
      int jE = j+3;
      for(; i < iE; i++ ) {
        for(; j< jE; j++ ) {
          if(board[i][j] == val) {
            return false;
          } 
        }
      }
      return true;
    }
  
    public int getBox(int row, int col, int inc, int count) {
      if(row >= inc-3 && row < inc && col >= inc-3 && col < inc) {
        return inc;
      } else {
        return getBox(row, col, inc+3, count + 1);
      }
    }
  
    public boolean checkEach(char[][] board,
                         char val,
                         int row,
                         int col,
                         int plusRow,
                         int plusCol) {
      if(row > board.length -1 || 
         row < 0 || 
         col > board[row].length -1 ||
         col < 0) {
        return true;
      }
      
      if(board[row][col] == val) {
        return false;
      }
      
      return checkEach(board, val, row+plusRow, col + plusCol, plusRow, plusCol);     
    }
  
    
} 
