import java.math.BigDecimal;

class Solution {
    public String largestNumber(int[] nums) {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					BigDecimal val1 = new BigDecimal(o1 + "" + o2);
                    BigDecimal val2 = new BigDecimal(o2 + "" + o1);
					return val2.compareTo(val1);

				}
			});
        for(int num : nums) {
            pq.add(num);
        }
        String result = "";
        while(!pq.isEmpty()) {
            result = result + "" +pq.poll();
        }
        if(result.startsWith("0")) return "0";
        return result;
    }
}
