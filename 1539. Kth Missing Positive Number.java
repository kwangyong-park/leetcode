class Solution {
    public int findKthPositive(int[] arr, int k) {
        int idx = 0;
        int count = 0;
        for(int i = 1; i <= 10000; i++) {
            if(idx < arr.length  && arr[idx] == i) {
                idx++;
            } else {
                count++;
            }
            if(count == k) {
                return i;
            }
        }
        throw null;
    }
}
