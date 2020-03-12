class Solution {
  public int numberOfSteps (int num) {
        return bk(num, 1);
    }
    public int bk(int num, int cnt) {
        if(num <= 0) {
            return cnt-1;
        }
        if(num%2==0){
            return bk(num / 2, cnt + 1);
        } else {
            return bk(num - 1, cnt + 1);
        }
    }
}
