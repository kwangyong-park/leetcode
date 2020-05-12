class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ret = 0;
        for(int n : nums) {
            ret = ret ^ n;
        }
        return ret;
    }
}
