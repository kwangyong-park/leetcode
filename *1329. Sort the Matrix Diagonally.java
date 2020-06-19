
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int width = mat.length;
        int height = mat[0].length;
        List<Integer> sort = new ArrayList();
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                sort.add(mat[i][j]);
            }
        }
        Collections.sort(sort);
        int[][] ret = new int[width][height];
        int x = 0;
        int y = 0;
        int count = 0;
        while(x < width && y < height )
            count=insert(sort, count, ret, x++, y++);
        return ret;
    }

    public int insert(List<Integer> lists, int count, int[][] ret, int x, int y) {

        for(int j = y ; j < ret[x].length; j++) {
            ret[x][j] = lists.get((Integer)count++);
        }
        for(int j = x+1 ; j < ret.length; j++) {
            ret[j][y] = lists.get((Integer)count++);
        }
        return count;
    }
}
