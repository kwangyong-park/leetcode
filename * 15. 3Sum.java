
import java.util.*;

class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    Set<String> set = new HashSet<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        perm(new ArrayList<>(), 0, nums);
        return ret;
    }

    public void perm(List<Integer> check, int val, int[] nums) {
        if(check.size() == 3) {
            if(val == 0) {
                List<Integer> list = new ArrayList<>();
                Collections.sort(check);
                String key = "";
                for(int i : check) {
                    list.add(nums[i]);
                    key += i + ",";
                }

                if(set.contains(key))
                    return;
                set.add(key);

                ret.add(list);
            }
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(check.contains(i)) {
                continue;
            }
            check.add(i);
            perm(check, val + nums[i], nums);
            check.remove(check.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
