class Solution {
    public boolean judgeCircle(String moves) {
    
        char[] chars = moves.toCharArray();
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < chars.length; i++ ) {
            if(chars[i] == 'R') {
                x++;
            } else if(chars[i] == 'L') {
                x--;
            } else if(chars[i] == 'U') {
                y++;                
            } else if(chars[i] == 'D') {
                y--;
            }
        }
        
        return x == 0 && y == 0;
    }
    
}
