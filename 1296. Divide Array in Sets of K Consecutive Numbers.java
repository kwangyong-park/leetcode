class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {

        Arrays.sort(nums);
        Map<Integer, Integer> count = new HashMap<>();
        for(int i : nums) {
            count.put(i, count.getOrDefault(i, 0)+1);
        }

        for(int i = 0 ; i < nums.length; i++) {
            if(count.get(nums[i]) == null)
                continue;
            int numsCount = 0;
            for(int j = nums[i]; j < nums[i]+k; j++) {
                if(count.get(j) == null || count.get(j) == 0)
                    break;
                count.put(j, count.get(j)-1);
                if(count.get(j) == 0)
                    count.remove(j);
                numsCount++;
            }
            if(numsCount < k) {
                return false;
            }
        }
        return count.size() == 0;
    }
}
