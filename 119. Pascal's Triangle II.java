
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) {
            return Arrays.asList(new Integer[]{1});
        }
        return rec(rowIndex, 1, Arrays.asList(new Integer[]{1}));

    }

    public List<Integer> rec(int rowIndex, int curIndex, List<Integer> parent) {
        if(rowIndex < curIndex) {
            return parent;
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add( 1);
        for(int i = 1; i < curIndex; i ++) {

            result.add(sum(parent, i));
        }
        result.add(1);
        return rec(rowIndex, curIndex + 1, result);
    }

    public int sum(List<Integer> parent, int pivot) {
        if(pivot == 0) return parent.get(0);
        else {
            int left = pivot - 1;
            int right = pivot;
            return parent.get(left) + parent.get(right);
        }
    }
}
