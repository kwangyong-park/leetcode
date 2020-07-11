class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int maxCurrent = 0;
        int maxSum = Integer.MIN_VALUE;
        int minCurrent = 0;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for(int i : A) {
            maxCurrent = Math.max(i, maxCurrent + i);
            maxSum = Math.max(maxSum, maxCurrent);
            minCurrent = Math.min(i, minCurrent + i);
            minSum = Math.min(minCurrent, minSum);
            sum+=i;
        }
        if(maxSum > 0) 
            return Math.max(maxSum, sum - minSum);
        else 
            return maxSum;
    }
}
