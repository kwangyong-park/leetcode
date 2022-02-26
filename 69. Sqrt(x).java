class Solution {
    
	// Binary Search approach
	
    // TC -> O( log(sqrt(x)) )
    
    // SC -> O(1)
    
    public int mySqrt(int x) {
        long ans = 0;
        long start = 0; 
        long end = Integer.MAX_VALUE;
        while( start <= end ){
            long mid = start + ( end - start ) / 2;
            if( mid * mid <= x ){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)ans;
    }
}
