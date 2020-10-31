class Solution {
    public int maxDistToClosest(int[] seats) {
        List<Integer> check = new ArrayList<>();
        for(int i = 0 ; i < seats.length; i++)
            if(seats[i] == 1) {
                check.add(i);
            }

        int maxSpace = 0;
        for(int i = 1; i < check.size(); i++) {
            if(maxSpace < check.get(i) - check.get(i - 1)) {
                maxSpace = check.get(i) - check.get(i - 1);
            }
        }
        int first = check.get(0) - 0;
        int end = (seats.length - 1) - check.get(check.size() - 1);

        int side = Math.max(first, end);

        if(side < maxSpace/2) {
            return maxSpace / 2;
        } else {
            return side;
        }
    }
}
