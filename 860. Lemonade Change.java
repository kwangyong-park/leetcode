class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int i = 0 ; i < bills.length; i++) {
            int bill = bills[i];
            if(bill == 5) {
                five++;
            } else if(bill == 10) {
                five--;
                ten++;
            } else if(bill == 20) {
                if(ten > 0) {
                    ten--;
                    five--;
                } else if(five >=3) {
                    five-=3;
                } else {
                    return false;
                }
            }
            if(ten < 0 || five < 0) {
                return false;
            }
        }
        return true;
    }
}
