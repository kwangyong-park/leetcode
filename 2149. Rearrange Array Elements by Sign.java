class Solution {
    public int[] rearrangeArray(int[] nums) {
        int negative = 1;
        int positive = 0;
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] < 0) {
                result[negative] = nums[i];
                negative+=2;
                System.out.println("1 " + negative);
            } else {
                result[positive] = nums[positive];
                positive+=2;
                System.out.println("2 " + positive);
            }
        }
        return result;
    }
}
