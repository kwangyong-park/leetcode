class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum=0;
        List<Integer> a1=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        Arrays.sort(nums);
        int sum1=0,k=0;
        
        for(int i=nums.length-1;i>=0;i--){
            sum1+=nums[i];
                sum-=nums[i];
            if(sum1>sum){
                k=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=k;j--){
            a1.add(nums[j]);
        }
        return a1;
    }
}
