class Solution {
	public int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
		for(int i = 0; i < nums.length; i++){
			q.add(nums[i]);
		}

		Integer ans = -1;
		for(int i = 0;i <k; i++) {
			if(i == k-1) {
				ans = q.poll();
				return ans;
			}
			q.poll();
		}

		return -1;
	}
}
