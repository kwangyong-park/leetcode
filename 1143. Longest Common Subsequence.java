class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();

        int[][] map = new int[array1.length+1][array2.length+1];

        for(int i = 1; i < map.length; i++) {
            for(int j = 1; j < map[i].length; j++) {
                if(array1[i-1] == array2[j-1]) {
                    map[i][j] = map[i - 1][j - 1] + 1;
                } else {
                    map[i][j] = Math.max(map[i - 1][j], map[i][j -1]);
                }
            }
        }

        return map[array1.length][array2.length];
    }
}
