class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> check = new HashSet<>();
        if(arr[0] == 0 && arr[1] == 0) return true;
        for(int i : arr) {
            check.add(i);
            if(i == 0) continue;
            if(i%2 == 0) {
                 if(check.contains(i / 2)) {
                     return true;
                 }
            }
            
            if(check.contains(i * 2)) {
                return true;
            }
        }   
        return false;
    }
    
}
