class Solution {
   public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor) 
            fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void fill(int[][] image, int r, int c, int target, int newColor) {
        
        if(image[r][c] == target) {
            image[r][c] = newColor;
            if(r + 1 < image.length) fill(image, r + 1, c, target, newColor);
            if(c + 1 < image[0].length) fill(image, r, c + 1, target, newColor);
            if(r >= 1) fill(image, r - 1, c, target, newColor);
            if(c >= 1) fill(image, r, c - 1, target, newColor);
        }
    }
}
