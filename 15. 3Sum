class Solution {
   
    Set<String> hashSet = new HashSet();
    public List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> result = new ArrayList();
        List<Num> arrays = new ArrayList();
        for(int num: nums) {
            arrays.add(new Num(num));
        }
        perm(arrays, new HashSet(), result);
        return result;
    }
    
    public void perm(List<Num> nums, Set<Num> temp, List<List<Integer>> results) {
        if(temp.size() == 3) {
            String str = "";
            List<Integer> a = new ArrayList();
            Iterator<Num> iter  = temp.iterator();
            while(iter.hasNext()) {
                a.add(iter.next().num);
            }
            Collections.sort(a);
            int sum = 0;
            for(int num: a) {
                str+=String.valueOf(num);
                sum +=num;
            }
            if(hashSet.contains(str)){
                return;
            }
            hashSet.add(str);
            if(sum == 0) {
                results.add(a);   
            }
            return;
        }
        for(Num n: nums) {
            if(temp.contains(n)) {
                continue;
            }
            temp.add(n);
            perm(nums, temp, results);
            temp.remove(n);
        }
        
    }
    
    class Num {
        int num;
        public Num(int n) {
            this.num = n;
        }
    }
}
