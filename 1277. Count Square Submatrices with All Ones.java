//This does not solve the code
class Solution {
    public int countSquares(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int ret = 0;
        for(int k = 0; k < Math.max(n, m); k++) {
            for(int i = 0; i < n; i ++) {
                for(int j = 0; j < m; j++) {
                    int q = 0;
                    while(q++ < k) {
                        if(q == k -1) {
                            ret++;
                        }
                        try {
                            if (arr[i + q][j + q] == 0) {
                                break;
                            }
                        } catch (Exception e) {
                            break;
                        }
                    }

                }
            }
        }
        return ret;
    }
}
