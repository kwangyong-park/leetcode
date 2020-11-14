class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int cnt = 0;
        for(int i = 0 ; i < A.length; i++) {
            int sum = 0;
            for(int j = i; j < A.length; j++) {
                sum+=A[j];
                if(sum == S) {
                    cnt++;  
                } else if(sum > S) {
                    break;
                }
            }
        }
        return cnt;
    }
}
