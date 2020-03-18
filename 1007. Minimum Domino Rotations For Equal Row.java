class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int result = A.length;
        boolean isRetrunFalse = false;
        for(int i = 1; i <= 6; i++) {
            int cntA = 0;
            int cntB = 0;
            boolean isPass = true;
            for(int k = 0; k < A.length; k++) {
                
                if(A[k] != i && B[k] == i) {
                    ++cntA;
                } else if(B[k] != i && A[k] == i) {
                    ++cntB;
                } else if(A[k] != i && B[k] != i) {
                    cntA=A.length;
                    cntBf=A.length;
                    isPass = false;
                    break;
                }
            }
            if(isPass) {
                isRetrunFalse = true;
                result = Math.min(Math.min(cntA, cntB), result);
            }
            
        }
        if(!isRetrunFalse) return -1;
        
        return result;
    }
    
}
