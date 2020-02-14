class Solution {
    public List<Integer> sortArray(int[] a) {
        return Arrays.stream(mergeSort(a)).boxed().collect(Collectors.toList());
    }
    
    public int[] mergeSort(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        
        int mid = a.length / 2;
		// divide section
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));
		// merge section
        for (int i = 0, j = 0; i < left.length || j < right.length;) {
		    // if our right side is already expended, or this left[i] is smaller, then use left[i].
            if (j == right.length || i < left.length && left[i] < right[j]) {
                a[i + j] = left[i];
                i++;
            }
            else {
                a[i + j] = right[j];
                j++;
            }
        }
        
        return a;
    }
}
