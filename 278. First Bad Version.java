/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return find(0, n);
    }
    
    public int find(long start, long end) {
        long mid = (end + start) / 2;
        
        if(isBadVersion((int)mid) == !isBadVersion((int)mid-1)) {
            return (int)mid;
        } else if(isBadVersion((int)mid)) {
            return find(start, mid-1);
        } else {
            return find(mid+1, end);
        }
    }
}
