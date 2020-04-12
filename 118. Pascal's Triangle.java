class Solution {
 public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows >=1) {
            List<Integer> row1 = new ArrayList();
            row1.add(1);
            result.add(row1);
        }
        if(numRows >=2) {
            List<Integer> row2 = new ArrayList();
            row2.add(1);
            row2.add(1);
            result.add(row2);
        }
        if(numRows >=3) {
            recurrence(result, 2, numRows);
        }
        return result;
    }
    public void recurrence(List<List<Integer>> tree, int currentRow, int rows) {
        if(rows == currentRow) {
            return;
        }
        List<Integer> row = new ArrayList(currentRow);
        row.add(1);
        for(int i = 1; i < currentRow; i++) {
            List<Integer> parentRows = tree.get(currentRow - 1);
            int num = parentRows.get(i) + parentRows.get(i-1);
            row.add(num);
        }
        row.add( 1);
        tree.add(row);

        recurrence(tree, currentRow + 1, rows);
    }
}
