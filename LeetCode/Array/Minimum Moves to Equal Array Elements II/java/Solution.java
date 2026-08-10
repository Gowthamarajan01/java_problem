class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
             int ans = 0, median = nums[nums.length / 2];
             for(int i : nums){
                ans += Math.abs(median - i);
             }
             return ans;
    }
}