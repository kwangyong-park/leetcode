class Solution {
   public int maxSubarraySumCircular(int[] A) {
        int ret = Integer.MIN_VALUE;
        for(int i = 0 ; i < A.length; i++) {
            int val = A[i];
            int max = A[i];
            for(int j = i + 1; j < A.length; j++) {
                ret = Math.max(ret, A[j] + val);
                val = Math.max(val + A[j], 0);
                max = Math.max(A[j], max);
            }
            for(int j = 0; j < i; j++) {
                ret = Math.max(ret, A[j] + val);
                val = val + A[j] >= 0 ? val + A[j] : 0;
                max = Math.max(A[j], max);
            }
            if(max < 0) {
                ret = Math.max(max, ret);
            } else {
                ret = Math.max(val, ret);
            }
        }
        return ret;
    }
}
