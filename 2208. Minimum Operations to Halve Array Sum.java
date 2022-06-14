class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());
        double sum = 0;
        double total = 0;
        int count = 0;
        for(int num : nums) {
            queue.add(Double.valueOf(num));
            total += num;
        }
        sum = total;
        while(sum > (total / 2) ) {
            double top = queue.poll() ;
            top = top / 2;
            queue.add(top);
            sum -= top;
            count++;
        }
        return count;
    }
}
