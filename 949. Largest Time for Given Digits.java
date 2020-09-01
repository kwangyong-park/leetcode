class Solution {
    String ret = null;
    int hour = -1;
    int min = -1;
    public String largestTimeFromDigits(int[] A) {
        Arrays.sort(A);
        perm(A, new HashSet<>(), "");
        if(ret == null) return "";
        return ret.substring(0, 2) + ":" + ret.substring(2, 4);
    }
    public void perm(int[] A, Set<Integer> check, String val) {
        if(check.size() == 4) {
            if(check(val)) {
                System.out.println(val);
                ret = val;
            }
            return;
        }
        for(int i = 0 ; i < 4; i ++) {
            if(check.contains(i)) continue;
            check.add(i);
            perm(A, check, val + "" + A[i]);
            check.remove((Integer)i);
        }
    }
    public boolean check(String val) {
        if(Integer.valueOf(val.substring(0, 2)) > 23) return false;
        if(Integer.valueOf(val.substring(2, 4)) > 59) return false;
        if(Integer.valueOf(val.substring(0, 2)) > hour && Integer.valueOf(val.substring(2, 4)) > min) {
            return true;
        }
        return false;
    }
}
