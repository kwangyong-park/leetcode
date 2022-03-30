class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int start = 0;
        int x = 0; 
        int y = 0;
        int arrow = -1;
        int idx = 0;
        int[] ans = new int[mat.length * mat[0].length];
        while(true) {
            if(mat.length > x && x >= 0 && mat[0].length > y && y >= 0){
                ans[idx++] = mat[x][y];
                y+=arrow;
                x+=arrow;
                System.out.println("test");
            } else {
                if(arrow > 0) {
                    x
                } else {
                    
                }
            }
            if(idx == ans.length) {
                break;
            }
        }
        return ans;
    }
}
