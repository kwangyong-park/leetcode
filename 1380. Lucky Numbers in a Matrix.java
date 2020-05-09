class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        for(int i = 0 ; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < matrix[i].length; j++) {
                min = Math.min(matrix[i][j], min);
            }
            rows.add(min);
        }
        for(int i = 0 ; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < matrix.length; j++){
                max = Math.max(max, matrix[j][i]);
            }
            if(rows.contains(max)) {
                return Arrays.asList(max);
            }
        }        
        
        return Arrays.asList();
    }
}
