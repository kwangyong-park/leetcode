class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans = new ArrayList<String>();

        int start = 0;
        for(int i = 0; i < nums.length; i++) {
            while(i+1 < nums.length && nums[i] - nums[i+1] == -1) {
                i++;
            }
            if(start == i) {
                ans.add(nums[i]+"");
            } else {
                ans.add(nums[start] + "->"+ nums[i]);
            }
            start = i+1;
        }
        
        return ans;
    }
}
