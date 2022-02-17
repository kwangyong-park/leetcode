class Solution {
    Set<String> check = new HashSet<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        rec(candidates, target, new ArrayList<>());
        return result;
    }
    public void rec(int[] candidates, int target, List<Integer> list)  {

        int ans = list.stream().reduce(0, Integer::sum);
        if(ans == target) {
            Stream<Integer> s = list.stream().sorted();
            String value = s.map(Object::toString).collect(Collectors.joining(","));
            if(check.contains(value)) {
                return;
            }
            check.add(value);
            result.add(list.stream().sorted().collect(Collectors.toList()));
        }
        for(int candidate : candidates) {
            if(ans + candidate <= target) {
                list.add(candidate);
                rec(candidates, target, list);
                list.remove(list.size() -1 );
            } else {
                break;
            }

        }

    }
}
