class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;
        List<Integer> list = new ArrayList<>();
        while(num > 0) {
            list.add(num%2);
            num /= 2;    
        }
        int ret = 0;
        int bb = 1;
        for(int i = 0; i < list.size() - 1; i++) {
            int pivot = list.get(i);
            if(pivot == 0) {
                ret += 1 * bb;
            }
            bb*=2;
        }
        return ret;
    }
}
