class Solution {
    int step = 0;
public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = i+1;
        }
        List<Integer> result = new  ArrayList();
        perm(result, nums, k);
        String s = "";
        for(int num: result) {
            s += String.valueOf(num);
        }
        return s;
    }
public boolean perm(List<Integer> temp, int[] nums, int k) {
        if(temp.size() == nums.length) {
            step++;
            if(step == k) {
                return true;
            }
            return false;
        }
for(int n : nums) {
            if(temp.contains(n))
                continue;
            temp.add(n);
            if(perm(temp, nums, k)) {
                return true;
            }
            temp.remove(temp.size() -1) ;
        }
        return false;
    }
 
}
