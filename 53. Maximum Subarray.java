class Solution {
    public int maxSubArray(int[] nums) {
        return sub(0, nums.length-1, nums);       
    }
    
    public int sub(int left, int right, int[] nums){
        
        if(left == right) {
            return nums[left];
        }
        int sum = 0;
        for(int i = left; i <= right; i++) {
            sum+=nums[i];
        }
        
        int mid = ( left + right) / 2;        
        int leftSum = sub(left, mid, nums);
        int rightSum = sub(mid, right, nums);
        int childsum = Math.max( rightSum, leftSum );
        return Math.max(childsum,sum);
        
        
    }
}
