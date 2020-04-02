class Solution {
    Set<Integer> visit = new HashSet<Integer>();
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        } else if (n < 0) {
            return false;
        } else if(visit.contains(n)) {
            return false;
        }
        visit.add(n);
        String text = n + "";
        char[] chars = text.toCharArray();
        
        int result = 0;
        for(char c : chars) {
            result += (c -'0')  * (c - '0');
        }
        
        
        return isHappy(result);
        
    }
}
