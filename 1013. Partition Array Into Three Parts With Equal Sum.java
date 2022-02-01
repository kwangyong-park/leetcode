class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int avg = 0;
        for(int i = 0 ; i < arr.length; i++) {
            avg += arr[i];
        }
         if(avg %3 !=0)
            return false;
        avg/=3;
       
        
        int[] partition = new int[3];
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i ++) {
            sum+=arr[i];
            if(sum == avg) {
                cnt++;
                sum = 0;
            }
        }
        
        return cnt >= 3;
        
    }
}
