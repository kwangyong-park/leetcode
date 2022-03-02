class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> result = new ArrayList<>();
        int mid = 0;
        
        for(int i = 0 ; i < nums.length; i++) {
            if(pivot > nums[i]) {
                result.add(nums[i]);
            } else if(pivot == nums[i]) {
                mid++;
            }
        }
        for(int i = 0 ; i < mid; i++) {
            result.add(pivot);
        }
  
        for(int i = 0 ; i < nums.length; i++) {
            if(pivot < nums[i]) {
                result.add(nums[i]);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
