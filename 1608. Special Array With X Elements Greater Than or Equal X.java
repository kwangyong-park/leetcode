class Solution {
    public int specialArray(int[] nums) {
        for(int i = 1; i < 1001; i++) {
            int cnt = 0;
            for(int num : nums) 
                if( num >= i) 
                    cnt++;
            
            if(i == cnt) 
                return i;
        }
        return -1;
    }
}
