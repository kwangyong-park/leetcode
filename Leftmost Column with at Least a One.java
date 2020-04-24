
class Solution {
    int rows = 0;
    int cols = 0;
    int ret = Integer.MAX_VALUE;
    public int leftMostColumnWithOne(BinaryMatrix bm) {
        rows = bm.dimensions().get(0);
        cols = bm.dimensions().get(1);
        find(bm, 0, cols-1);
        return ret == Integer.MAX_VALUE ? -1 : ret;
    }
    
    public void find(BinaryMatrix bm, int row, int col) {
        if(col < 0 || row >= rows) {
            return ;
        }
        if(bm.get(row, col) == 1) {
            ret = Math.min(ret, col);
            find(bm, row, col - 1);
        } else {
            find(bm, row + 1, col);
        }
    }
}
