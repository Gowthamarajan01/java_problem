class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum1 = 0;
        int max= nums[0];
        int min = nums[0];
        int sum2 = 0;
        int tot = 0;
        for(int i = 0 ; i < nums.length;i++){
            sum1 = Math.max(nums[i],sum1+nums[i]);
            max = Math.max(max,sum1);
            sum2 = Math.min(nums[i],sum2+nums[i]);
            min = Math.min(min,sum2);
            tot+=nums[i];
        }
        if(max < 0) return max;
        return Math.max(max,tot - min);
    }
}