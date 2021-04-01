class Solution {
    public int countVowelStrings(int n) {
        return count(0, n);
    }
    
    public int count(int cur, int n) {
        if(n == 0) {
            return 1;
        }
        int sum = 0;
        for(int i = cur; i <5; i++) {
            sum+=count(i, n - 1);
        }
        return sum;
    }
}
