class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
      int sum = 0;
      int min = Integer.MAX_VALUE;
    //   for(int i = 0 ; i < n;i++){
    //     sum+=nums[i];
      
      int l = 0;
      int r = 0;
    while(r < n){
        sum+=nums[r++];
       while(sum>=target){
       min = Math.min(min,r-l);
       sum -= nums[l++];
       }
      }
       return min == Integer.MAX_VALUE ? 0 : min;
    }
}