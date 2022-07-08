class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int beforeH = 0;
        int beofreV = 0;
        long maxH = 0;
        long maxV = 0;
        for(int i = 0; i < horizontalCuts.length; i++) {
            maxH = Math.max(horizontalCuts[i] - beforeH, maxH);
            beforeH = horizontalCuts[i];
            System.out.println(beforeH);
        }
        maxH = Math.max(h - horizontalCuts[horizontalCuts.length-1], maxH);

        for(int i = 0; i < verticalCuts.length; i++) {
            
            maxV = Math.max(verticalCuts[i] - beofreV, maxV);
            beofreV = verticalCuts[i];
        }
        maxV = Math.max(w - verticalCuts[verticalCuts.length-1], maxV);
        
        
        System.out.println(maxH);
        System.out.println(maxV);
        
        return (int)(maxH * maxV % 1000000007L);
    }
}
