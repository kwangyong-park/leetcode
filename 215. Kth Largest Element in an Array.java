class Solution {
  
    public int[] merge(int[] left, int[] right) {
        int lp = 0;
        int rp = 0;
        int pivot = 0;
        int leftSize = left.length;
        int rightSize = right.length ;
        int[] result = new int[left.length + right.length];
        while(leftSize > lp || rightSize > rp) {
            if(leftSize > lp && rightSize > rp) {
                if(left[lp] > right[rp]) {
                    result[pivot++] = left[lp++];
                } else {
                    result[pivot++] = right[rp++];
                }
            } else if(leftSize > lp) {
                result[pivot++] = left[lp++];
            } else if(rightSize > rp) {
                result[pivot++] = right[rp++];
            }
        }
        return result;
    }

    public int[] div(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = div(Arrays.copyOfRange(nums, 0, mid));
        int[] right = div(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }

    public int findKthLargest(int[] nums, int k) {
        int[] result = div(nums);
        return result[k-1];
    }
}
