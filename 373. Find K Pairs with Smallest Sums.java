class Solution {
  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> {
            return (o1.getKey() + o1.getValue()) - (o2.getKey() + o2.getValue());
        });
        for(int i = 0 ; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                queue.add(new Pair<>(nums1[i], nums2[j]));
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            Pair<Integer, Integer> pair = queue.poll();
            if(pair == null) break;
            result.add(Arrays.asList(pair.getKey(), pair.getValue()));

        }
        return result;
    }
}
