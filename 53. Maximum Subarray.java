class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int ret = Integer.MIN_VALUE;
        int val = A[0];
        for(int i = 1; i < A.length; i ++) {
            val = Math.max(Math.max(val, 0) + A[i], val);
            ret = Math.max(val, ret);
        }
        
        return ret;
    }
}
