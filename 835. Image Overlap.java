class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int max = 0;
        
        for (int row=0;row<A.length;row++){
            for (int col=0;col<A[row].length;col++){
                max=Math.max(max,find(row,col,A,B));
                max=Math.max(max,find(row,col,B,A));
            }
        }
        
        return max;
    }
    
    public int find(int row, int col, int[][] M, int[][] N){
        int count=0;
        
        for (int i=row;i<N.length;i++){
            for (int j=col;j<N[i].length;j++){
                if (M[i][j]==1 && M[i][j]==N[i-row][j-col])
                    count++;
            }
        }
        
        return count;
    }
}
