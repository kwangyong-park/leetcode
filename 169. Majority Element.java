class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap();
        int maxVal = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++ ) {
            Integer n = counter.get(nums[i]) ;
            if(n == null) {
                counter.put(nums[i], 1);
                n = 0;
            } else {
                counter.put(nums[i], n + 1);
            }
            if(maxVal < n +1 ){
                maxVal = n+1;
                maxIndex = nums[i];
            }
        }
        return maxIndex;
    }
}
