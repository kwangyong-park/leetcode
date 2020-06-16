class Solution {
    Stack<Pair<Integer,Integer>> stack = new Stack<>();
    Set<String> check = new HashSet<>();
    public void solve(char[][] board) {
        if(board.length == 0) return;
        int row = board.length;
        int col = board[0].length; 
        for(int i = 0; i < row; i++)  {
            if(board[i][0] == 'O')
                push(new Pair(i, 0));
            if(board[i][col-1] == 'O')
                push(new Pair(i, col-1));
        }

        for(int i = 0; i < col; i++) {
            if(board[0][i] == 'O')
                push(new Pair(0, i));
            if(board[row-1][i] == 'O')
                push(new Pair(row-1, i));
        }

        int[][] arrow = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while(!stack.isEmpty()) {
            Pair<Integer, Integer> pair = stack.pop();
            int x = pair.getKey();
            int y = pair.getValue();
            for(int i = 0 ; i < arrow.length; i++) {
                if(x + arrow[i][0] >= 0 && x + arrow[i][0] < board.length &&
                        y + arrow[i][1] >= 0 && y + arrow[i][1] < board[0].length)
                    if(board[x + arrow[i][0]][y + arrow[i][1]] == 'O') {
                        push(new Pair<>(x + arrow[i][0], y + arrow[i][1]));
                    }
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(!check.contains(i + "," + j)) {
                    board[i][j] = 'X';
                }
            }
        }

    }
    public void push(Pair<Integer, Integer> pair) {
        String key = pair.getKey() + "," + pair.getValue();
        if(check.contains(key))
            return;
        stack.push(pair);
        check.add(key);
    }

}
