
import java.util.*;
import java.util.stream.Collectors;
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {

        sum(root);
        Optional<Map.Entry<Integer, Integer>> entry = map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue));

        if(!entry.isPresent()) {
            return new int[]{};
        }
        int max = entry.get().getValue();
        return map.entrySet().stream().filter(a -> a.getValue() == max).map(a -> a.getKey()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
    }

    public int sum(TreeNode root) {
        if(root == null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        int sum = root.val + left + right;
        int cnt = map.getOrDefault(sum, 0);
        map.put(sum, cnt + 1);
        return sum;
    }
}
