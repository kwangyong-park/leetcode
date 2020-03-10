class Solution {
    
    public int[][] merge(int[][] intervals) {
        int[] sort = new int[10000];
        int label = 1;
        int max = 0;
        for(int i = 0 ; i < intervals.length; i++) {
            int cur = label;
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                if(sort[j] != 0) {
                    cur = sort[j];
                }
                sort[j] = cur;
                max  = j;
            }
            label++;
        }
        List<List<Integer>> result = new ArrayList<>();
        int cur = 0;
        int min = 0;
        for(int i = 0 ; i < sort.length; i++) {
            if(sort[i] == cur) {
                continue;
            }
            if(cur > label){
                break;
            }
            if(sort[i] != cur) {
                if(sort[min] != 0 && sort[i-1] != 0) {
                    result.add(Arrays.asList(min, i - 1));
                }
                min = i;
                cur = sort[i];
            }
        }
        int[][] a = new int[result.size()][];
        for(int i = 0 ; i < a.length; i++) {
            a[i] = new int[] {result.get(i).get(0), result.get(i).get(1)};
        }
        return a;
    }
}
