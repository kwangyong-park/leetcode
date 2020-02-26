class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;
        while(left < height.length && right > 0) {
            int deep = Math.min(height[left], height[right]);
            int water = (right - left) * deep;
            if(water > maxWater) {
                maxWater = water;    
            }
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            
        }
        return maxWater;
    }
}
