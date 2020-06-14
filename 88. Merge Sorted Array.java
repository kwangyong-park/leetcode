class Solution {
    public void merge(int[] nums1, int M, int[] nums2, int N) {
        System.arraycopy(nums2, 0, nums1, M, N);
        Arrays.sort(nums1);
        
    }
}
