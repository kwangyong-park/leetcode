class Solution {
    public int pivotIndex(int[] nums) {
        int[] right = new int[nums.length+1];
        int[] left = new int[nums.length+1];

        int sum = 0;
        for(int i = 1 ; i < nums.length; i++) {
            sum+=nums[i];
            right[nums.length-i] = right[right.length-i] + nums[nums.length-i];
            left[i] = left[i - 1] + nums[i-1];
        }
        for(int i = 0; i < nums.length; i++){

            if(left[i] == right[i+1]) {
                return i;
            }
        }
        return -1;

    }
}
