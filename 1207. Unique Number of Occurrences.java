class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i = 0 ; i < arr.length; i++) {
            if(set1.contains(arr[i])) continue;
            set1.add(arr[i]);
            int count = 0;
            for(int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(set2.contains(count)) return false;
            set2.add(count);
            
        }
        return true;
        
    }
}
