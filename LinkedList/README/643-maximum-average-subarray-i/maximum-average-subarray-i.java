class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double max = Integer.MIN_VALUE;
         int left =0;
         int sum = 0;
         
         for(int right =0; right<nums.length;right++){
            sum += nums[right];
            if(right >= k-1){
                max = Math.max(max,sum);
                sum -= nums[left++];
                
            }
         }
         return max/k;
    }
}